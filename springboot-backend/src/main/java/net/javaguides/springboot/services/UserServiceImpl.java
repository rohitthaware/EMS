package net.javaguides.springboot.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.daos.RoleDao;
import net.javaguides.springboot.daos.UserDao;
import net.javaguides.springboot.dtos.Credentials;
import net.javaguides.springboot.dtos.DTOEntityConverter;
import net.javaguides.springboot.dtos.UserDTO;
import net.javaguides.springboot.model.Role;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.model.constants.RoleName;


@Service
@Transactional
public class UserServiceImpl {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private RoleDao roleDao;
	@Autowired
	private DTOEntityConverter converter;
	@Autowired
	private PasswordEncoder passwordEncoder;

	public UserDTO saveUser(UserDTO userDto) {
		String rawPassword = userDto.getPassword();
		String encPassword = passwordEncoder.encode(rawPassword);
		userDto.setPassword(encPassword);
		User user = converter.toUserEntity(userDto);
		user = userDao.save(user);
		userDto = converter.toUserDTO(user);
		userDto.setPassword("*******");
		return userDto;
	}
	
	public UserDTO saveEditedProfile(UserDTO userDTO) {
		User user = converter.toUserEntity(userDTO);
		user = userDao.save(user);
		return converter.toUserDTO(user);
	}
	
	public UserDTO findUserByEmailAndPassword(Credentials cred) {
		User dbUser = userDao.findByEmail(cred.getEmail());
		String rawPassword = cred.getPassword();
		if(dbUser != null && passwordEncoder.matches(rawPassword, dbUser.getPassword())) {
			UserDTO result = converter.toUserDTO(dbUser);
			result.setPassword("*******");
			return result;
		}
		return null;
	}
	
	public int getUserRoleId(RoleName roleName) {
		Role role = roleDao.findByRoleName(roleName);
		return role.getRoleId();
	}

}

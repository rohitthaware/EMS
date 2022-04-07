package net.javaguides.springboot.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Role;
import net.javaguides.springboot.model.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	public User findByEmail(String email);
	
	List<User> findByRole(Role role);

}

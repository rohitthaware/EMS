package net.javaguides.springboot.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Role;
import net.javaguides.springboot.model.constants.RoleName;





public interface RoleDao extends JpaRepository<Role, Integer> {
	
	public Role findByRoleName(RoleName roleName);
}

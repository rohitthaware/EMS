package net.javaguides.springboot.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.javaguides.springboot.model.constants.RoleName;

@Entity
@Table(name = "Role")
public class Role {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column
	private int roleId;
	@Enumerated(EnumType.STRING)
	private RoleName roleName;
	@OneToMany(mappedBy = "role")
	private List<User> userList;
	public Role(int roleId, RoleName roleName, List<User> userList) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.userList = userList;
	}
	public Role(int roleId) {
		super();
		this.roleId = roleId;
	}
	public Role() {
		super();
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public RoleName getRoleName() {
		return roleName;
	}
	public void setRoleName(RoleName roleName) {
		this.roleName = roleName;
	}
	@JsonIgnore
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName;
	}
	
	

}

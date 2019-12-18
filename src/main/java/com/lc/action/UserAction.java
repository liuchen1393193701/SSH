package com.lc.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lc.pojo.Users;
import com.lc.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private Users user;
	@Autowired
	private IUserService us;
	List<Users> users;
	
	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

	public UserAction() {
		System.out.println("UserAction.UserAction()");		
		// TODO Auto-generated constructor stub
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String save() {
		us.save(user);
		return "success";
	}
	public String findAll() {
		users=us.finaAll();
		return "list";
	}
}

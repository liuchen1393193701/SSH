package com.lc.dao;

import java.util.List;

import com.lc.pojo.Users;

public interface IUserDAO {
	void save(Users obj);
	List<Users> findAll();
}

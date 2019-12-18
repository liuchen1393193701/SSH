package com.lc.service;

import java.util.List;

import com.lc.pojo.Users;

public interface IUserService {
	void save(Users obj);
	List<Users> finaAll();
}

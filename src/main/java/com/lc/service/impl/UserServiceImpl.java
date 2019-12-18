package com.lc.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lc.dao.IUserDAO;
import com.lc.pojo.Users;
import com.lc.service.IUserService;
@Service
@Transactional
public class UserServiceImpl implements IUserService{
	@Autowired
	IUserDAO userDAO;
	@Override
	public void save(Users obj) {
		// TODO Auto-generated method stub
		userDAO.save(obj);
	}

	@Override
	public List<Users> finaAll() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}

}

package com.lc.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lc.dao.IUserDAO;
import com.lc.pojo.Users;
@Repository
public class UserDAOImpl implements IUserDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void save(Users obj) {
		// TODO Auto-generated method stub
		sessionFactory.openSession().save(obj);
	}

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.openSession().createCriteria(Users.class).list();
	}

}

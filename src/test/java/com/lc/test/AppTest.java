package com.lc.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lc.dao.IUserDAO;
import com.lc.pojo.Users;
import com.lc.service.IUserService;

public class AppTest {

	@Test
	public void test() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserService ud = ac.getBean(IUserService.class);
		Users users=new Users();
		users.setUname("bbb");
		users.setUpwd("123");
		ud.save(users);
	}

}

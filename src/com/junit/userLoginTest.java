package com.junit;

import org.aspectj.lang.annotation.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.action.userAction;

public class userLoginTest{
	static ApplicationContext tx;
	static userAction userAction;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		tx= new ClassPathXmlApplicationContext("applicationContext.xml");
		userAction = (userAction) tx.getBean("userAction");
	}
	@Test
	public void login() throws Exception{
		userAction.login();
	}
	
}

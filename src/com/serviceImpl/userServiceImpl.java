package com.serviceImpl;

import com.dao.userDao;
import com.service.userService;

public class userServiceImpl implements userService{
	userDao dao;
	@Override
	public void login(String loginName, String loginPwd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reigster(String loginName, String loginPwd, String sex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginout() {
		// TODO Auto-generated method stub
		
	}
	public void setDao(userDao dao){
		this.dao= dao;
	}
}

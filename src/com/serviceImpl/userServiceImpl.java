package com.serviceImpl;

import com.bean.User;
import com.dao.userDao;
import com.daoImpl.userDaoImpl;
import com.service.userService;

public class userServiceImpl implements userService{
	private userDao dao= new userDaoImpl();
	@Override
	public Boolean login(String loginName, String loginPwd) {
		return dao.login(loginName, loginPwd);
	}

	@Override
	public void reigster(String loginName, String loginPwd, String sex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginout() {
		// TODO Auto-generated method stub
		
	}
}

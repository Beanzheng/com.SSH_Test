package com.action;

import com.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.userService;

public class userAction extends ActionSupport implements ModelDriven<User>{
	userService service;
	private User model = new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return model;
	}
	
	public String login() throws Exception{
		
		return null;
		
	}
	public void setService(userService service){
		this.service= service;
	}

}

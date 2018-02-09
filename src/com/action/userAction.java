package com.action;

import org.springframework.beans.BeanUtils;

import com.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.userService;
import com.serviceImpl.userServiceImpl;

public class userAction extends ActionSupport implements ModelDriven<User>{
	userService service= new userServiceImpl();
	private User model = new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return model;
	}
	
	public String login() throws Exception{
		Boolean user= service.login(getModel().getLoginName(),getModel().getLoginPwd());
		boolean temp=true;
		if(user){
			
			return SUCCESS;
		}else {
			temp=false;
			return ERROR;
		}
		
		
		
	}
	public String reigster(String loginName,String loginPwd,String sex) throws Exception{
		
		return null;
	}
	public String loginout(){
		return null;
	}
	public void setService(userService service){
		this.service= service;
	}

}

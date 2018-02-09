package com.bean;

public class User {
	//无参构造
	public User(){}
	//get(),set()方法
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	private Integer uid; 		//用户id
	private String loginName;	//登录名
	private String loginPwd;	//密码
	private String sex;			//性别
	/**
	 * 构造方法	
	 * */
	public User(Integer uid,String loginName,String loginPwd,String sex){
		this.uid=uid;
		this.loginName=loginName;
		this.loginPwd= loginPwd;
		this.sex=sex;
	}
}

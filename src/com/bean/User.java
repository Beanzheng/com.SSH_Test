package com.bean;

public class User {
	//�޲ι���
	public User(){}
	//get(),set()����
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
	private Integer uid; 		//�û�id
	private String loginName;	//��¼��
	private String loginPwd;	//����
	private String sex;			//�Ա�
	/**
	 * ���췽��	
	 * */
	public User(Integer uid,String loginName,String loginPwd,String sex){
		this.uid=uid;
		this.loginName=loginName;
		this.loginPwd= loginPwd;
		this.sex=sex;
	}
}

package com.service;
/**
 * 用户管理业务逻辑接口
 */
public interface userService {
	public void login(String loginName,String loginPwd);
	public void reigster(String loginName,String loginPwd,String sex);
	public void loginout();
}

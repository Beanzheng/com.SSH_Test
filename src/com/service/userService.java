package com.service;

import com.bean.User;

/**
 * 用户管理业务逻辑接口
 */
public interface userService {
	public Boolean login(String loginName,String loginPwd);
	public void reigster(String loginName,String loginPwd,String sex);
	public void loginout();
}

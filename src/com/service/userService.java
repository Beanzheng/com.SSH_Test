package com.service;

import com.bean.User;

/**
 * �û�����ҵ���߼��ӿ�
 */
public interface userService {
	public Boolean login(String loginName,String loginPwd);
	public void reigster(String loginName,String loginPwd,String sex);
	public void loginout();
}

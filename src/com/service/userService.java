package com.service;

import com.bean.User;

/**
 * �û�����ҵ���߼��ӿ�
 */
public interface userService {
	public User login(Integer uid);
	public void reigster(String loginName,String loginPwd,String sex);
	public void loginout();
}

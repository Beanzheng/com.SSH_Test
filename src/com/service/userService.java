package com.service;
/**
 * �û�����ҵ���߼��ӿ�
 */
public interface userService {
	public void login(String loginName,String loginPwd);
	public void reigster(String loginName,String loginPwd,String sex);
	public void loginout();
}

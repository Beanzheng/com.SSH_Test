package com.dao;

import com.bean.User;

/**
 * �û�����ײ����ݷ��ʽӿ�
 * */
public interface userDao {
	/**
	 * �����½����
	 * @param user
	 */
	public void login(User user);
	/**
	 * ����ע�����
	 * @param user
	 */
	public void reigster(User user);
	/**
	 * ����ע������
	 * @param uid
	 * @return
	 */
	public Boolean loginout(Integer uid);
}

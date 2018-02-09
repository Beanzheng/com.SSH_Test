package com.dao;

import com.bean.User;

/**
 * 用户管理底层数据访问接口
 * */
public interface userDao {
	/**
	 * 处理登陆服务
	 * @param user
	 */
	public void login(User user);
	/**
	 * 处理注册服务
	 * @param user
	 */
	public void reigster(User user);
	/**
	 * 处理注销服务
	 * @param uid
	 * @return
	 */
	public Boolean loginout(Integer uid);
}

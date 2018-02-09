package com.dao;

import com.bean.movie;

/**
 * 电影管理底层数据访问接口
 * */
public interface movieDao {
	/*
	 * 增加电影
	 */
	public void addMovie(movie movie);
	/*
	 * 删除电影
	 */
	public void delMovie(Integer mid);
	/*
	 * 修改电影
	 */
	public void modMovie(movie movie);
	/*
	 * 搜索电影
	 */
	public void seaMovie(String movieName);
}

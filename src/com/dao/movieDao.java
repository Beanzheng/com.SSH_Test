package com.dao;

import com.bean.movie;

/**
 * ��Ӱ����ײ����ݷ��ʽӿ�
 * */
public interface movieDao {
	/*
	 * ���ӵ�Ӱ
	 */
	public void addMovie(movie movie);
	/*
	 * ɾ����Ӱ
	 */
	public void delMovie(Integer mid);
	/*
	 * �޸ĵ�Ӱ
	 */
	public void modMovie(movie movie);
	/*
	 * ������Ӱ
	 */
	public void seaMovie(String movieName);
}

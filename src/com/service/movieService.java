package com.service;

import java.util.List;

import com.bean.movie;

/**��Ӱ�����߼�����ӿ�*/
public interface movieService {
	/**
	 * ��ӵ�Ӱ
	 * @param movieName
	 * @param movieScore
	 * @param movieDirector
	 * @param movieScreenWriter
	 * @param movie_to_start
	 * @param movietype
	 * @param movieProducerRegions
	 * @param movieLanguage
	 * @param movieTime
	 * @param movieImage
	 */
	public void addMovie(String movieName,Integer movieScore,String movieDirector,String movieScreenWriter
			,String movie_to_start,String movietype,String movieProducerRegions
			,String movieLanguage,String movieTime,String movieImage);
	/**
	 * ɾ����Ӱ
	 * @param mid
	 */
	public void delMovie(Integer mid);
	/**
	 * �޸ĵ�Ӱ
	 * @param movie
	 */
	public void modMovie(movie movie);
	/**
	 * ��ѯ��Ӱ
	 * @param movieName
	 * @return
	 */
	public List<movie>seaMovie(String movieName);
}

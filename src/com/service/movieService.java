package com.service;

import java.util.List;

import com.bean.movie;

/**电影管理逻辑处理接口*/
public interface movieService {
	/**
	 * 添加电影
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
	 * 删除电影
	 * @param mid
	 */
	public void delMovie(Integer mid);
	/**
	 * 修改电影
	 * @param movie
	 */
	public void modMovie(movie movie);
	/**
	 * 查询电影
	 * @param movieName
	 * @return
	 */
	public List<movie>seaMovie(String movieName);
}

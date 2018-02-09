package com.serviceImpl;

import java.util.List;

import com.bean.movie;
import com.dao.movieDao;
import com.service.movieService;

public class movieServiceImpl implements movieService{
	movieDao mDao;
	@Override
	public void addMovie(String movieName, Integer movieScore,
			String movieDirector, String movieScreenWriter,
			String movie_to_start, String movietype,
			String movieProducerRegions, String movieLanguage,
			String movieTime, String movieImage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delMovie(Integer mid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modMovie(movie movie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<movie> seaMovie(String movieName) {
		// TODO Auto-generated method stub
		return null;
	}
	public void setDao(movieDao mDao){
		this.mDao= mDao;
	}
}

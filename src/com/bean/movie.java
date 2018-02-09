package com.bean;

public class movie {
	//无参构造
	public movie(){}
	//get(),set()方法
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Integer getMovieScore() {
		return movieScore;
	}
	public void setMovieScore(Integer movieScore) {
		this.movieScore = movieScore;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public String getMovieScreenWriter() {
		return movieScreenWriter;
	}
	public void setMovieScreenWriter(String movieScreenWriter) {
		this.movieScreenWriter = movieScreenWriter;
	}
	public String getMovie_to_start() {
		return movie_to_start;
	}
	public void setMovie_to_start(String movie_to_start) {
		this.movie_to_start = movie_to_start;
	}
	public String getMovietype() {
		return movietype;
	}
	public void setMovietype(String movietype) {
		this.movietype = movietype;
	}
	public String getMovieProducerRegions() {
		return movieProducerRegions;
	}
	public void setMovieProducerRegions(String movieProducerRegions) {
		this.movieProducerRegions = movieProducerRegions;
	}
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	public String getMovieTime() {
		return movieTime;
	}
	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}
	public String getMovieImage() {
		return movieImage;
	}
	public void setMovieImage(String movieImage) {
		this.movieImage = movieImage;
	}
	private Integer mid;			//电影id
	private String movieName;		//电影名
	private Integer movieScore;		//电影评分
	private String movieDirector;	//导演
	private String movieScreenWriter;	//编辑
	private String movie_to_start;		//主演
	private String movietype;			//电影类型
	private String movieProducerRegions;		//产地
	private String movieLanguage;		//语言
	private String movieTime;			//时长
	private String movieImage;			//电影图片
	/**
	 *构造方法
	 * */
	public movie(
			Integer mid,
			String movieName,
			Integer movieScore,
			String movieDirector,
			String movieScreenWriter,
			String movie_to_start,
			String movietype,
			String movieProducerRegions,
			String movieLanguage,
			String movieTime,
			String movieImage){
		this.mid=mid;
		this.movieName= movieName;
		this.movieScore= movieScore;
		this.movieDirector= movieDirector;
		this.movieScreenWriter= movieScreenWriter;
		this.movie_to_start = movie_to_start;
		this.movietype= movietype;
		this.movieProducerRegions=movieProducerRegions;
		this.movieLanguage= movieLanguage;
		this.movieTime=movieTime;
		this.movieImage= movieImage;
		
	}
}

package com.flipkart.mc.entity;

public class Shows {
	
	private String showId;
	private String screenId;
	private String movieId;
	private boolean full;
	
	
	public Shows(String showId, String screens, String movieId) {
		super();
		this.showId = showId;
		this.screenId = screens;
		this.movieId = movieId;
	}
	
	public String getShowId() {
		return showId;
	}
	public void setShowId(String showId) {
		this.showId = showId;
	}
	public String getScreensId() {
		return screenId;
	}
	public void setScreensId(String screens) {
		this.screenId = screens;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public boolean getFull() {
		return full;
	}

	public void setFull(boolean full) {
		this.full = full;
	}
	
	
	

}

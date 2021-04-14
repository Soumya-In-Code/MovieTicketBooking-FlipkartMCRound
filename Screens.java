package com.flipkart.mc.entity;

import java.util.ArrayList;
import java.util.List;

public class Screens {
	
	private List<Movie> movie;
	private int seats;
	private static List<Integer> seatNums;
	private String screenId;
	
	public Screens(){
		this.seatNums = new ArrayList<>();
		for(int i=1; i<11; i++) {
			seatNums.add(i);
		}
	}

	public List<Movie> getMovie() {
		return movie;
	}

	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public List<Integer> getSeatNums() {
		return seatNums;
	}

	public String getScreenId() {
		return screenId;
	}

	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}
	
	
}

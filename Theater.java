package com.flipkart.mc.entity;

import java.util.List;

public class Theater {
	
	private String theaterId;
	
	private List<Shows> showList;

	public List<Shows> getShowList() {
		return showList;
	}

	public void setShowList(List<Shows> showList) {
		this.showList = showList;
	}

	public String getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(String theaterId) {
		this.theaterId = theaterId;
	}
	

}

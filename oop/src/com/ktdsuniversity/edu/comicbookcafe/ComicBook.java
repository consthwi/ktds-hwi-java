package com.ktdsuniversity.edu.comicbookcafe;

public class ComicBook {
	
	private String title;
	private boolean isRental;
	
	public ComicBook(String title, boolean isRental) {
		this.title = title;
		this.isRental = isRental;
	}

	public String getTitle() {
		return this.title;
	}
	
	public boolean getIsRental() {
		return this.isRental;
	}
	
	public void setToggleIsRental() {
		this.isRental = !this.isRental;
	}
	
	

	
	
	
}

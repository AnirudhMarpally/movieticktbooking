package com.example.ticketbooking.model;

import java.util.List;

public class Booking {
    private String movie;
    private String screen;
    private List<String> seats;
    // Constructor, getters, and setters
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public List<String> getSeats() {
		return seats;
	}
	public void setSeats(List<String> seats) {
		this.seats = seats;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(String movie, String screen, List<String> seats) {
		super();
		this.movie = movie;
		this.screen = screen;
		this.seats = seats;
	}
    
}



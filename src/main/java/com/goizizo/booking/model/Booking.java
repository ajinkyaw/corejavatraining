package com.goizizo.booking.model;

public class Booking {
	
	int bookingId;
	int flightNo;
	int customerId;
	
	public Booking(int flightNo, int customerId) {
		 
		this.flightNo = flightNo;
		this.customerId = customerId;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;

	}

	
	
		
	//new changes made

	
	public int getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	
	

}

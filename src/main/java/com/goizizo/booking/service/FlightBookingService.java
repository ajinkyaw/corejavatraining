package com.goizizo.booking.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.goizizo.booking.model.Booking;
import com.goizizo.booking.model.Flight;

@Service
public interface FlightBookingService {
	
	List<Flight> getAllFlights();
	Flight getFlightById(int flightId);
	void createBooking(Booking booking);
	
}

package com.goizizo.booking.service;

import java.beans.JavaBean;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goizizo.booking.model.Booking;
import com.goizizo.booking.model.Flight;
import com.goizizo.booking.repository.FlightRepository;

@Service("FlightBookingService")
public class FlightBookingServiceImpl implements FlightBookingService {
	
	@Autowired
	FlightRepository flightRepository;
	
	@Override
	public List<Flight> getAllFlights() {
		
		return flightRepository.getAllFlights();
	}

	@Override
	public Flight getFlightById(int flightId) {
	 
		return flightRepository.getFlightById(flightId);
	}

	@Override
	public void createBooking(Booking booking) {
		flightRepository.createBooking(booking);
	}
	
}

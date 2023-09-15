package com.goizizo.booking.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.goizizo.booking.model.Booking;
import com.goizizo.booking.model.Flight;

@Repository
public interface FlightRepository {

		List<Flight> getAllFlights();
		Flight getFlightById(int flightId);
		void createBooking(Booking booking);
	
}

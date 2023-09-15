package com.goizizo.booking.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.goizizo.booking.model.Booking;
import com.goizizo.booking.model.Flight;

@Repository("FlightRepository")
public class FlightRepositoryImpl implements FlightRepository {
	
	List<Flight> flightList;
	List<Booking> bookingList;
	
	{
		flightList = new ArrayList<Flight>();
		flightList.add(new Flight(1,"Pune","Jaipur","1:00 PM"));
		flightList.add(new Flight(1,"dELHI","CHENNAI","4:06 AM"));
		flightList.add(new Flight(1,"KOCHI","Jaipur","5:30 PM"));
		flightList.add(new Flight(1,"NASIK","SIKKIM","6:07 AM"));

		bookingList = new ArrayList<Booking>();
	
	}
	
	@Override
	public List<Flight> getAllFlights() {
		
		return flightList;
	}

	@Override
	public Flight getFlightById(int flightId) {
	 
		return flightList.get(0);
	}

	@Override
	public void createBooking(Booking booking) {
		bookingList.add(booking);
	}

}

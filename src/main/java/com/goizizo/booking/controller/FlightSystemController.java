package com.goizizo.booking.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.goizizo.booking.model.Booking;
import com.goizizo.booking.model.Flight;
import com.goizizo.booking.service.FlightBookingService;
import com.goizizo.booking.service.JDBCService;
import com.goizizo.booking.util.Login;

@RestController
public class FlightSystemController   {

	@Autowired
	private JDBCService jdbcService;

	@Autowired
	FlightBookingService bookingService;

	@GetMapping("/dashboard")
	public ModelAndView dashboard(ModelAndView model) {
		String message = "Welcome to our Spring Boot application!";
		model.addObject("message", message);
		model.setViewName("dashboard");
		return model; // This corresponds to the view name (welcome.html)
	}

	@GetMapping("/getAllFlights")
	public ResponseEntity<ArrayList<Flight>> getAllFlights(ModelAndView model) {
		ArrayList<Flight> list = jdbcService.getFlights();
		model.addObject("flightsList", list);
		model.setViewName("booking");
		return ResponseEntity.ok(list);
	}

	@GetMapping("/getAllFlights/{flightId}")
	public String getFlightById(@PathVariable int flightId) {
		return bookingService.getFlightById(flightId).toString();
	}

	@GetMapping("/createBooking")
	public void createBooking(Booking booking) {
		bookingService.createBooking(booking);
	}

	@GetMapping("/login")
	public ModelAndView showLoginPage(ModelAndView model) {
		model.addObject("login", new Login());
		model.setViewName("login");
		return model;
	}
 
	
	@PostMapping("/login-api")
	public ModelAndView registerUser(@Valid Login login, BindingResult bindingResult) {
		
		 ModelAndView modelAndView = new ModelAndView();

	        if (bindingResult.hasErrors()) {
	            modelAndView.setViewName("login"); // Return to the form page with validation errors
	            modelAndView.addObject("login", login); // Add form object with errors
	        } else {
	            // Form input is valid, perform further processing
	            modelAndView.setViewName("success"); // Redirect to a success page
	        }

	        return modelAndView;
	}

	@PostMapping("/booking-api")
	public String bookFlightApi(@RequestParam("flightId") int flightId, Model model) {
		
		Booking booking = new Booking(flightId, 1);
		int result = jdbcService.bookFlight(booking);
		if (result > 0) {
			return "Flight Booked. Jao Jaldi";
		} else {
			return "Ghar par baitho";
		}

	}
	
	//	Change in controller
	//	Hello Why are we still here ?

}

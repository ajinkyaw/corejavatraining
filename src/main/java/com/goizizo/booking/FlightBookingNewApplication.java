package com.goizizo.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FlightBookingNewApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingNewApplication.class, args);
	}
 
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FlightBookingNewApplication.class);
	}	
	 
	
}

class rujG
{
	
}
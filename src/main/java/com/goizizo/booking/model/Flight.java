package com.goizizo.booking.model;

public class Flight {
	
	int flightId;
	String flightDeptCity;
	String flightArrCity;
	String deptTime;
	
	public Flight(int flightId, String flightDeptCity, String flightArrCity, String deptTime) {
		this.flightId = flightId;
		this.flightDeptCity = flightDeptCity;
		this.flightArrCity = flightArrCity;
		this.deptTime = deptTime;
	}
	
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightDeptCity=" + flightDeptCity + ", flightArrCity="
				+ flightArrCity + ", deptTime=" + deptTime + "]";
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
		System.out.println("Flight Id set");
	}

	public String getFlightDeptCity() {
		return flightDeptCity;
	}

	public void setFlightDeptCity(String flightDeptCity) {
		this.flightDeptCity = flightDeptCity;
	}

	public String getFlightArrCity() {
		return flightArrCity;
	}

	public void setFlightArrCity(String flightArrCity) {
		this.flightArrCity = flightArrCity;
	}

	public String getDeptTime() {
		return deptTime;
	}

	public void setDeptTime(String deptTime) {
		this.deptTime = deptTime;
	}
	
	
	
	
 }

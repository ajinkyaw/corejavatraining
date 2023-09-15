package com.goizizo.booking.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.goizizo.booking.model.Booking;
import com.goizizo.booking.model.Flight;
import com.goizizo.booking.util.JDBCUtil;

@Service
public class JDBCService {

	public ArrayList<Flight> getFlights() {

		ArrayList<Flight> flightsList = new ArrayList<>();
		
		try {
			
			Connection connection = JDBCUtil.getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM FlightMaster");
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				int id = resultSet.getInt("id");
				String deptCity = resultSet.getString("deptCity");
				String arrCity = resultSet.getString("arrCity");
				String deptTime = resultSet.getString("deptTime");

				Flight flight = new Flight(id, deptCity, arrCity, deptTime);
				flightsList.add(flight);

			}
			
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
			 
		}
		return flightsList;
	}

	public int bookFlight(Booking booking) {

		int rowsAffected = 0;
		try {

			Connection connection = JDBCUtil.getConnection();
			String sqlInsert = "INSERT INTO Booking ( flightNo, customerId) VALUES ( ?, ?)";

			PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
			
			preparedStatement.setInt(1, booking.getFlightNo());
			preparedStatement.setInt(2, booking.getCustomerId());

			rowsAffected = preparedStatement.executeUpdate();

			System.out.println("Rows affected: " + rowsAffected);
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rowsAffected;
	}

}

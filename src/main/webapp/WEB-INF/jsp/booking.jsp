<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>List of Flights</title>
</head>
<body>
	<h2>List of Flights</h2>
	<table border="1">
		<thead>
			<tr>
				<th>Flight ID</th>
				<th>Departure City</th>
				<th>Arrival City</th>
				<th>Departure Time</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="flight" items="${flightsList}">
				<form action="/booking-api" method="post">
				<tr>
					<input type="hidden" id="flightId" name="flightId"
						value="${flight.flightId}">
					<td>${flight.flightId}</td>
					<td>${flight.flightDeptCity}</td>
					<td>${flight.flightArrCity}</td>
					<td>${flight.deptTime}</td>
					<td><input type="submit" value="Book"></td>
				</tr>
				</form>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>

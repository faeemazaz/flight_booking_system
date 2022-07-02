package com.flightbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flightbooking.entity.Booking;
import com.flightbooking.entity.Flight;
import com.flightbooking.entity.Passanger;
import com.flightbooking.service.FlightBookingService;

@RestController
public class FlighBookingController {
	@Autowired
	private FlightBookingService flightBookingService;

	// insert flight
	@RequestMapping(value = "/flight", method = RequestMethod.POST)
	public ResponseEntity<Flight> insertFlight(@RequestBody Flight flight) {
		flightBookingService.insertFlight(flight);
		return ResponseEntity.ok(flight);
	}

	// select flight
	@RequestMapping(value = "/flight", method = RequestMethod.GET)
	public ResponseEntity<List<Flight>> fetchFlights() {
		List<Flight> getFlights = flightBookingService.findAllFlights();
		return ResponseEntity.ok(getFlights);
	}

	// insert booking
	@RequestMapping(value = "/booking", method = RequestMethod.POST)
	public ResponseEntity<Booking> insertBooking(@RequestBody Booking booking) {
		flightBookingService.insertBooking(booking);
		return ResponseEntity.ok(booking);
	}

	// select booking
	@RequestMapping(value = "/booking", method = RequestMethod.GET)
	public ResponseEntity<List<Booking>> fetchBooking() {
		List<Booking> getBookings = flightBookingService.findAllBookings();
		return ResponseEntity.ok(getBookings);
	}

	// insert passanger with booking detail
	@RequestMapping(value = "/passangerbooking", method = RequestMethod.POST)
	public ResponseEntity<Passanger> insertPassangerBooking(@RequestBody Passanger passanger) {
		flightBookingService.insertPassangerBooking(passanger);
		return ResponseEntity.ok(passanger);
	}

	// select bookings from passanger
	@RequestMapping(value = "/passangerbooking", method = RequestMethod.GET)
	public ResponseEntity<List<Passanger>> getPassangerBooking() {
		List<Passanger> getPassangerWithBooking = flightBookingService.getPassangerBooking();
		return ResponseEntity.ok(getPassangerWithBooking);
	}
}

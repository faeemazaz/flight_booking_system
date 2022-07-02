package com.flightbooking.service;

import java.util.List;

import com.flightbooking.entity.Booking;
import com.flightbooking.entity.Flight;
import com.flightbooking.entity.Passanger;

public interface FlightBookingService {
	Flight insertFlight(Flight flight);
	List<Flight> findAllFlights();
	
	Booking insertBooking(Booking booking);
	List<Booking> findAllBookings();
	
	Passanger insertPassangerBooking(Passanger passanger);
	List<Passanger> getPassangerBooking();
}

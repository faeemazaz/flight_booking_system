package com.flightbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.entity.Booking;
import com.flightbooking.entity.Flight;
import com.flightbooking.entity.Passanger;
import com.flightbooking.repository.BookingRepo;
import com.flightbooking.repository.FlightRepo;
import com.flightbooking.repository.PassangerRepo;

@Service
public class FlightBookingServiceImpl implements FlightBookingService{
	
	@Autowired
	private FlightRepo flightRepo;
	
	@Autowired
	private BookingRepo bookingRepo;
	
	@Autowired
	private PassangerRepo passangerRepo;

	@Override
	public Flight insertFlight(Flight flight) {
		return flightRepo.save(flight);
	}

	@Override
	public List<Flight> findAllFlights() {
		return flightRepo.findAll();
	}

	@Override
	public Booking insertBooking(Booking booking) {
		return bookingRepo.save(booking);
	}

	@Override
	public List<Booking> findAllBookings() {
		return bookingRepo.findAll();
	}

	@Override
	public Passanger insertPassangerBooking(Passanger passanger) {
		for(Booking bookings: passanger.getBookings())
		{
			bookings.setPassanger(passanger);
		}
		return passangerRepo.save(passanger);
	}

	@Override
	public List<Passanger> getPassangerBooking() {
		return passangerRepo.findAll();
	}

}

package com.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightbooking.entity.Flight;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Long> {

}

package com.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightbooking.entity.Passanger;

public interface PassangerRepo extends JpaRepository<Passanger, Long> {

}

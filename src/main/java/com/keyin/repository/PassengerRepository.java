package com.keyin.repository;

import com.keyin.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}


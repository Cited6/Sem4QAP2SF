package com.keyin.repository;

import com.keyin.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AirportRepository extends JpaRepository<Airport, Long> {
}


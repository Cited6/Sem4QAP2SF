package com.keyin.repository;

import com.keyin.entity.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AircraftRepository extends JpaRepository<Aircraft, Long> {
}

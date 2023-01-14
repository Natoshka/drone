package com.interview.drone.repository;

import com.interview.drone.entity.Drone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DroneRepository extends JpaRepository<Drone, Long> {
}

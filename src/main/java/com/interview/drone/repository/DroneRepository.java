package com.interview.drone.repository;

import com.interview.drone.entity.Drone;
import com.interview.drone.entity.DroneState;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DroneRepository extends JpaRepository<Drone, Long> {

    List<Drone> findAllByBatteryCapacityAfterAndState(int minBatteryCapacity, DroneState state);
}

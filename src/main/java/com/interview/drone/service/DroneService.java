package com.interview.drone.service;

import com.interview.drone.dto.LoadDroneDto;
import com.interview.drone.entity.Drone;
import com.interview.drone.entity.Medication;

import java.util.List;
import java.util.Set;

public interface DroneService {

    Drone registerDrone(Drone drone);

    Drone loadDrone(LoadDroneDto droneDto);

    Set<Medication> getLoadedMedications(Long droneId);

    List<Drone> getAvailableDrones();

    Integer getDroneBatteryCapacity(Long droneId);

    void makeBatteryCapacityLog();
}

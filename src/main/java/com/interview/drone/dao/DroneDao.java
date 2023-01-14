package com.interview.drone.dao;

import com.interview.drone.entity.Drone;
import com.interview.drone.entity.DroneBatteryLog;

import java.util.List;

public interface DroneDao {

    Drone save(Drone drone);

    Drone findById(Long droneId);

    List<Drone> getAvailableDrones(int minBatteryCapacity);

    List<Drone> getAllDrones();

    DroneBatteryLog saveDroneBatteryLog(DroneBatteryLog log);
}

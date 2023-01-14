package com.interview.drone.dao.impl;

import com.interview.drone.dao.DroneDao;
import com.interview.drone.entity.DroneBatteryLog;
import com.interview.drone.entity.DroneState;
import com.interview.drone.repository.DroneBatteryLogRepository;
import com.interview.drone.repository.DroneRepository;
import com.interview.drone.entity.Drone;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DroneDaoImpl implements DroneDao {

    private final DroneRepository droneRepository;
    private final DroneBatteryLogRepository droneBatteryLogRepository;

    @Override
    public Drone save(Drone drone) {
        return droneRepository.save(drone);
    }

    @Override
    public Drone findById(Long droneId) {
        return droneRepository.findById(droneId)
            .orElseThrow(() -> new EntityNotFoundException("Drone is not found by id: " + droneId));
    }

    @Override
    public List<Drone> getAvailableDrones(int minBatteryCapacity) {
        return droneRepository.findAllByBatteryCapacityAfterAndState(minBatteryCapacity, DroneState.IDLE);
    }

    @Override
    public List<Drone> getAllDrones() {
        return droneRepository.findAll();
    }

    @Override
    public DroneBatteryLog saveDroneBatteryLog(DroneBatteryLog log) {
        return droneBatteryLogRepository.save(log);
    }
}

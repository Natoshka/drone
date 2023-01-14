package com.interview.drone.dao.impl;

import com.interview.drone.dao.DroneDao;
import com.interview.drone.repository.DroneRepository;
import com.interview.drone.entity.Drone;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DroneDaoImpl implements DroneDao {

    private final DroneRepository droneRepository;

    @Override
    public Drone save(Drone drone) {
        return droneRepository.save(drone);
    }
}

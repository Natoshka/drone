package com.interview.drone.service.impl;

import com.interview.drone.dao.DroneDao;
import com.interview.drone.entity.Drone;
import com.interview.drone.service.DroneService;
import com.interview.drone.validator.DroneValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DroneServiceImpl implements DroneService {

    private final DroneDao droneDao;
    private final DroneValidator droneValidator;

    @Override
    @Transactional
    public Drone registerDrone(Drone drone) {
        droneValidator.validate(drone);
        return droneDao.save(drone);
    }
}

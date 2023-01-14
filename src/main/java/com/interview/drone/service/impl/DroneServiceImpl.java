package com.interview.drone.service.impl;

import com.interview.drone.dao.DroneDao;
import com.interview.drone.dao.MedicationDao;
import com.interview.drone.dto.LoadDroneDto;
import com.interview.drone.entity.Drone;
import com.interview.drone.entity.DroneBatteryLog;
import com.interview.drone.entity.DroneState;
import com.interview.drone.entity.Medication;
import com.interview.drone.exception.BusinessLogicException;
import com.interview.drone.service.DroneService;
import com.interview.drone.validator.DroneValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class DroneServiceImpl implements DroneService {

    private static final int MIN_BATTERY_CAPACITY = 25;

    private final DroneDao droneDao;
    private final MedicationDao medicationDao;
    private final DroneValidator droneValidator;

    @Override
    @Transactional
    public Drone registerDrone(Drone drone) {
        droneValidator.validate(drone);
        return droneDao.save(drone);
    }

    @Override
    @Transactional
    public Drone loadDrone(LoadDroneDto loadDroneDto) {
        Drone drone = droneDao.findById(loadDroneDto.getDroneId());
        Set<Medication> medications = medicationDao.getMedicationByIds(loadDroneDto.getMedicationIds());

        checkBusinessLogic(loadDroneDto, drone, medications);

        drone.setMadications(medications);
        drone.setState(DroneState.LOADING);
        drone = droneDao.save(drone);
        return drone;
    }

    @Override
    public Set<Medication> getLoadedMedications(Long droneId) {
        return droneDao.findById(droneId).getMadications();
    }

    @Override
    public List<Drone> getAvailableDrones() {
        return droneDao.getAvailableDrones(MIN_BATTERY_CAPACITY - 1);
    }

    @Override
    public Integer getDroneBatteryCapacity(Long droneId) {
        return droneDao.findById(droneId).getBatteryCapacity();
    }

    @Override
    @Transactional
    public void makeBatteryCapacityLog() {
        droneDao.getAllDrones().forEach(drone -> {
            droneDao.saveDroneBatteryLog(
                DroneBatteryLog.builder()
                    .batteryCapacity(drone.getBatteryCapacity())
                    .drone(drone)
                    .logDatetime(LocalDateTime.now())
                    .build()
            );
        });
    }

    private void checkBusinessLogic(LoadDroneDto loadDroneDto, Drone drone, Set<Medication> medications) {
        if (medications.size() != loadDroneDto.getMedicationIds().size()) {
            throw new EntityNotFoundException("Ids of medications are not found in database");
        }
        int sum = medications.stream()
            .map(Medication::getWeight)
            .mapToInt(Integer::intValue)
            .sum();
        if (sum > drone.getWeightLimit()) {
            throw new BusinessLogicException("The sum weight of medications is more than the drone capability");
        }
        if (drone.getBatteryCapacity() < MIN_BATTERY_CAPACITY) {
            throw new BusinessLogicException("The battery of drone needs charging");
        }
        if (!drone.getState().equals(DroneState.IDLE)) {
            throw new BusinessLogicException("The drone is busy");
        }
    }

}

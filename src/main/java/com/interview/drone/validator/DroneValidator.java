package com.interview.drone.validator;

import com.interview.drone.entity.Drone;
import com.interview.drone.exception.DroneModelException;
import org.springframework.stereotype.Component;

@Component
public class DroneValidator implements BaseValidator<Drone> {

    public void validate(Drone drone) {
        if (drone.getSerialNumber().length() > 100) {
            throw new DroneModelException("The serial number of the drone should be less or equal then 100 symbols");
        }
        if (drone.getWeightLimit() > 500) {
            throw new DroneModelException("The weight limit of the drone should be less or equal then 500 gr");
        }
        if (drone.getBatteryCapacity() > 100) {
            throw new DroneModelException("The battery capacity of the drone should be less or equal then 100 %");
        }
    }
}

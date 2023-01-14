package com.interview.drone.validator;

import com.interview.drone.entity.Drone;
import com.interview.drone.entity.DroneState;
import com.interview.drone.exception.DroneModelException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@ActiveProfiles(profiles = "e2e")
class DroneValidatorTest {

    @Autowired
    private DroneValidator droneValidator;

    @Test
    void testValidate() {
        Exception exception = assertThrows(DroneModelException.class,
            () -> droneValidator.validate(
                Drone.builder()
                    .serialNumber("123456")
                    .batteryCapacity(100)
                    .weightLimit(501)
                    .state(DroneState.IDLE)
                    .build()
            ));
        assertEquals("The weight limit of the drone should be less or equal then 500 gr", exception.getMessage());
    }

}
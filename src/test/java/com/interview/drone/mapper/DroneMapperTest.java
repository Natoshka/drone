package com.interview.drone.mapper;

import com.interview.drone.dto.DroneDto;
import com.interview.drone.entity.Drone;
import com.interview.drone.entity.DroneModel;
import com.interview.drone.entity.DroneState;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles(profiles = "e2e")
class DroneMapperTest {

    @Autowired
    private DroneMapper droneMapper;

    @Test
    void testMapperToDto() {
        Drone drone = Drone.builder()
            .serialNumber("123456")
            .batteryCapacity(100)
            .weightLimit(500)
            .state(DroneState.IDLE)
            .model(DroneModel.builder()
                .id(1L)
                .name("Lightweight")
                .build())
            .build();

        DroneDto droneDto = droneMapper.toDto(drone);
        assertEquals(drone.getSerialNumber(), droneDto.getSerialNumber());
        assertEquals(drone.getBatteryCapacity(), droneDto.getBatteryCapacity());
        assertEquals(drone.getWeightLimit(), droneDto.getWeightLimit());
        assertEquals(drone.getState(), droneDto.getState());
        assertEquals(drone.getModel().getId(), droneDto.getModel().getId());
        assertEquals(drone.getModel().getName(), droneDto.getModel().getName());
    }
}

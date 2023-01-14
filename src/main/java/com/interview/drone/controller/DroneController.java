package com.interview.drone.controller;

import com.interview.drone.dto.DroneDto;
import com.interview.drone.mapper.DroneMapper;
import com.interview.drone.service.DroneService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api("Operations with drones")
@RestController
@RequiredArgsConstructor
public class DroneController {

    private final DroneService droneService;
    private final DroneMapper droneMapper;

    @ApiOperation("Register new drone")
    @PostMapping(value = "/register")
    public DroneDto register(@ApiParam("Drone date") @RequestBody DroneDto droneDto) {
        return droneMapper.toDto(
            droneService.registerDrone(
                droneMapper.toEntity(droneDto)));
    }

    /**
     * - registering a drone;
     * - loading a drone with medication items;
     * - checking loaded medication items for a given drone;
     * - checking available drones for loading;
     * - check drone battery level for a given drone;
     */
}

package com.interview.drone.controller;

import com.interview.drone.dto.DroneDto;
import com.interview.drone.dto.LoadDroneDto;
import com.interview.drone.dto.MedicationDto;
import com.interview.drone.mapper.DroneMapper;
import com.interview.drone.mapper.MedicationMapper;
import com.interview.drone.service.DroneService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * - registering a drone;
 * - loading a drone with medication items;
 * - checking loaded medication items for a given drone;
 * - checking available drones for loading;
 * - check drone battery level for a given drone;
 */
@Api("Operations with drones")
@RestController
@RequiredArgsConstructor
public class DroneController {

    private final DroneService droneService;
    private final DroneMapper droneMapper;
    private final MedicationMapper medicationMapper;

    @ApiOperation("Registering a drone")
    @PostMapping("/register")
    public DroneDto registerDrone(@ApiParam("Drone data") @RequestBody DroneDto droneDto) {
        return droneMapper.toDto(
            droneService.registerDrone(
                droneMapper.toEntity(droneDto)));
    }

    @ApiOperation("Loading a drone with medication items")
    @PostMapping("/load")
    public DroneDto loadDrone(@ApiParam("Drone loading data") @RequestBody LoadDroneDto droneDto) {
        return droneMapper.toDto(
            droneService.loadDrone(droneDto));
    }

    @ApiOperation("Checking loaded medication items for a given drone")
    @GetMapping("/{id}/loaded-medication")
    public Set<MedicationDto> getLoadedMedications(@ApiParam("Drone id") @PathVariable("id") Long droneId) {
        return droneService.getLoadedMedications(droneId)
            .stream()
            .map(medicationMapper::toDto)
            .collect(Collectors.toSet());
    }

    @ApiOperation("Checking available drones for loading")
    @GetMapping("/available-drones")
    public List<DroneDto> getAvailableDrones() {
        return droneService.getAvailableDrones()
            .stream()
            .map(droneMapper::toDto)
            .collect(Collectors.toList());
    }

    @ApiOperation("Check drone battery level for a given drone")
    @GetMapping("/{id}/battery-level")
    public Integer getDroneBatteryCapacity(@ApiParam("Drone id") @PathVariable("id") Long droneId) {
        return droneService.getDroneBatteryCapacity(droneId);
    }

}

package com.interview.drone.controller;

import com.interview.drone.dto.MedicationDto;
import com.interview.drone.mapper.MedicationMapper;
import com.interview.drone.service.MedicationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Api("Operations with medications")
@RestController
@RequiredArgsConstructor
public class MedicationController {

    private final MedicationService medicationService;
    private final MedicationMapper medicationMapper;

    @ApiOperation("Get all medications")
    @GetMapping(value = "/medication")
    public List<MedicationDto> getMedications() {
        return medicationService.getMedications()
            .stream()
            .map(medicationMapper::toDto)
            .collect(Collectors.toList());
    }

    @ApiOperation("Add new medication")
    @PostMapping(value = "/medication/add")
    public MedicationDto addMedication(@ApiParam("Medication data") @RequestBody MedicationDto medicationDto) {
        return medicationMapper.toDto(
            medicationService.addMedication(
                medicationMapper.toEntity(medicationDto)));
    }
}

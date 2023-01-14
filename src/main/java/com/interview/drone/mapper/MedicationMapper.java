package com.interview.drone.mapper;

import com.interview.drone.dto.MedicationDto;
import com.interview.drone.entity.Medication;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MedicationMapper extends BaseMapper<Medication, MedicationDto> {

}

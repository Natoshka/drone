package com.interview.drone.mapper;

import com.interview.drone.dto.DroneModelDto;
import com.interview.drone.entity.DroneModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DroneModelMapper extends BaseMapper<DroneModel, DroneModelDto> {

}

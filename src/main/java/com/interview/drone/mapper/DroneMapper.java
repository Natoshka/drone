package com.interview.drone.mapper;

import com.interview.drone.dto.DroneDto;
import com.interview.drone.entity.Drone;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { DroneModelMapper.class })
public interface DroneMapper extends BaseMapper<Drone, DroneDto> {

}

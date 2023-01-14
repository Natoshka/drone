package com.interview.drone.dto;

import com.interview.drone.entity.DroneState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@ApiModel("Drone data")
@AllArgsConstructor
@NoArgsConstructor
public class DroneDto {

    @ApiModelProperty("Serial number")
    private String serialNumber;

    @ApiModelProperty("Weight limit")
    private Integer weightLimit;

    @ApiModelProperty("Battery capacity")
    private Integer batteryCapacity;

    @ApiModelProperty("State")
    private DroneState state;

    @ApiModelProperty("Model")
    private DroneModelDto model;

}
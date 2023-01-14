package com.interview.drone.dto;

import com.interview.drone.entity.DroneState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@ApiModel("Drone data")
@AllArgsConstructor
@NoArgsConstructor
public class DroneDto {

    @ApiModelProperty("Identification")
    private Long id;

    @ApiModelProperty("Serial number")
    private String serialNumber;

    @NotNull
    @ApiModelProperty("Weight limit")
    private Integer weightLimit;

    @ApiModelProperty("Battery capacity")
    private Integer batteryCapacity;

    @ApiModelProperty("State")
    private DroneState state;

    @ApiModelProperty("Model")
    private DroneModelDto model;

}

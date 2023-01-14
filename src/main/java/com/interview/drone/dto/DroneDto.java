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

    @NotNull(message = "Weight Limit can not be null")
    @ApiModelProperty("Weight limit")
    private Integer weightLimit;

    @ApiModelProperty("Battery capacity")
    @NotNull(message = "Battery capacity can not be null")
    private Integer batteryCapacity;

    @ApiModelProperty("State")
    private DroneState state;

    @ApiModelProperty("Model")
    private DroneModelDto model;

}

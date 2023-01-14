package com.interview.drone.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import java.util.List;

@Data
@Builder
@ApiModel("Loading drone by medications data")
@AllArgsConstructor
@NoArgsConstructor
public class LoadDroneDto {

    @NotNull(message = "Drone identification can not be null")
    @ApiModelProperty("Drone identification")
    private Long droneId;

    @NotEmpty(message = "List of medication can not be null")
    @ApiModelProperty("List of medication identifications")
    private List<Long> medicationIds;
}

package com.interview.drone.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@ApiModel
@AllArgsConstructor
@NoArgsConstructor
public class DroneModelDto {

    @ApiModelProperty("Identification")
    private Long id;

    @ApiModelProperty("Name")
    private String name;

}

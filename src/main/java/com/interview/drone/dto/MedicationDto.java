package com.interview.drone.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@ApiModel("Medication data")
@AllArgsConstructor
@NoArgsConstructor
public class MedicationDto {

    @ApiModelProperty("Identificator")
    private Long id;

    @ApiModelProperty("Name")
    private String name;

    @ApiModelProperty("Weight")
    private Integer weight;

    @ApiModelProperty("Code")
    private String code;

    @ApiModelProperty("Image base64")
    private String image;
}

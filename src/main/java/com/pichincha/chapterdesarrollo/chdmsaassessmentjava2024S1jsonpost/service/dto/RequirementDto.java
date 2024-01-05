package com.pichincha.chapterdesarrollo.chdmsaassessmentjava2024S1jsonpost.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pichincha.chapterdesarrollo.chdmsaassessmentjava2024S1jsonpost.domain.enums.RequirementUrgency;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RequirementDto {

    @JsonProperty
    private int id;

    @JsonProperty
    @NotBlank
    private String requirement;

    @JsonProperty
    @NotBlank
    private RequirementUrgency urgency;

}

package com.pichincha.chapterdesarrollo.chdmsaassessmentjava2024S1jsonpost.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Builder
@Data
public class StructureDto {

    @JsonProperty
    private int id;

    @JsonProperty
    @NotBlank
    private String token;

    @JsonProperty
    @NotEmpty
    private Set<RequirementDto> requirements;
}

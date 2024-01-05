package com.pichincha.chapterdesarrollo.chdmsaassessmentjava2024S1jsonpost.controller;

import com.pichincha.chapterdesarrollo.chdmsaassessmentjava2024S1jsonpost.service.StructureService;
import com.pichincha.chapterdesarrollo.chdmsaassessmentjava2024S1jsonpost.service.dto.StructureDto;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assessment/api/v1/structure")
@AllArgsConstructor
public class StructureController {

    private StructureService structureService;

    @PostMapping
    public ResponseEntity<StructureDto> save(@RequestBody @Valid StructureDto structureDto) {
        return ResponseEntity.ok(structureService.saveStructure(structureDto));
    }

}

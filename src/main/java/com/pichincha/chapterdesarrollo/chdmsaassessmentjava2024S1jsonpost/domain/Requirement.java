package com.pichincha.chapterdesarrollo.chdmsaassessmentjava2024S1jsonpost.domain;

import com.pichincha.chapterdesarrollo.chdmsaassessmentjava2024S1jsonpost.domain.enums.RequirementUrgency;
import jakarta.persistence.*;

@Entity
@Table(name = "requirements")
public class Requirement {

    @Id
    @Column(name = "requirement_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "requirement")
    private String requirement;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "urgency", nullable = false)
    private RequirementUrgency urgency;

}

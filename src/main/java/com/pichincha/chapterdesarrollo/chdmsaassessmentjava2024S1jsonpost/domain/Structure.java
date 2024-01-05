package com.pichincha.chapterdesarrollo.chdmsaassessmentjava2024S1jsonpost.domain;

import jakarta.persistence.*;
import lombok.Builder;

import java.util.HashSet;
import java.util.Set;

@Builder
@Entity
@Table(name = "STRUCTURE")
public class Structure {

    @Id
    @Column(name = "structure_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "TOKEN")
    private String token;

    @Builder.Default
    @OneToMany
    @MapsId("structure_id")
    private Set<Requirement> requirements = new HashSet<>();

}

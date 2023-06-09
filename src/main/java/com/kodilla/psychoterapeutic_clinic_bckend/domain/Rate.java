package com.kodilla.psychoterapeutic_clinic_bckend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "RATE")
public class Rate {
    public Rate(long id, BigDecimal grade, Set<Therapist> therapist) {
        this.id = id;
        this.grade = grade;
        this.therapist = therapist;
    }

    public Rate(long id, BigDecimal grade, String opinion, Set<Therapist> therapist) {
        this.id = id;
        this.grade = grade;
        this.opinion = opinion;
        this.therapist = therapist;
    }

    @Id
    @GeneratedValue
    private long id;
    @Column(name = "GRADE")
    private BigDecimal grade;

    @Column(name = "OPINION")
    private String opinion;

    @Column(name = "THERAPIST_ANSWER")
    private String therapistAnswer;

    @OneToMany(mappedBy = "rate")
    private Set<Therapist> therapist = new HashSet<>();
}
package com.kodilla.psychoterapeutic_clinic_bckend.domain.Dto;

import com.kodilla.psychoterapeutic_clinic_bckend.domain.Therapist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RateDto {
    public RateDto(long id, BigDecimal grade, Set<Therapist> therapist) {
        this.id = id;
        this.grade = grade;
        this.therapist = therapist;
    }

    public RateDto(long id, BigDecimal grade, String opinion, Set<Therapist> therapist) {
        this.id = id;
        this.grade = grade;
        this.opinion = opinion;
        this.therapist = therapist;
    }

    private long id;
    private BigDecimal grade;
    private String opinion;
    private String therapistAnswer;
    private Set<Therapist> therapist = new HashSet<>();
}

package com.kodilla.psychoterapeutic_clinic_bckend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "RATE")
public class Rate {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "RATE")
    private BigDecimal rate;
}

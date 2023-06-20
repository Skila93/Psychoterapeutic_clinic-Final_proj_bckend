package com.kodilla.psychoterapeutic_clinic_bckend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Calendar {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "NAME")
    private String name;
}
package com.kodilla.psychoterapeutic_clinic_bckend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "THERAPIST")
public class Therapist {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "NAME")
    private String firstName;

    @Column(name = "SURNAME")
    private String lastName;

    /*@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "POSITION_ID")
    private Position positionId;*/

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "RATE_ID", referencedColumnName = "id")
    private Rate rate;

    @OneToMany(mappedBy = "therapistId")
    private Set<Appointment> appointments = new HashSet<>();

    /*@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "CALENDAR_ID")
    private Calendar calendar;*/
}
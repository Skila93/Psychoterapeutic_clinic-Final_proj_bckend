package com.kodilla.psychoterapeutic_clinic_bckend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "APPOINTMENT")
public class Appointment {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "THERAPIST_ID")
    private Therapist therapistId;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_ID")
    private User user;

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "START_DATE")
    private LocalDate startDate;

    @Column(name = "FINISH_DATE")
    private LocalDate finishDate;

    @Column(name = "COMMENT")
    private String comment;
}

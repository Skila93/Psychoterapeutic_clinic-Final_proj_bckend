package com.kodilla.psychoterapeutic_clinic_bckend.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "CLIENTS")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "NAME")
    private String firstName;

    @Column(name = "SURNAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String emailAdress;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
}
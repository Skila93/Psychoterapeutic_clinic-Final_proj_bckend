package com.kodilla.psychoterapeutic_clinic_bckend.domain.Dto;

import com.kodilla.psychoterapeutic_clinic_bckend.domain.Appointment;
import com.kodilla.psychoterapeutic_clinic_bckend.domain.Calendar;
import com.kodilla.psychoterapeutic_clinic_bckend.domain.Position;
import com.kodilla.psychoterapeutic_clinic_bckend.domain.Rate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TherapistDto {
    private long id;
    private String firstName;
    private String lastName;
    /*private Position position;*/
    private Rate rate;
    private Set<Appointment> appointments;
    /*private Calendar calendar;*/
}
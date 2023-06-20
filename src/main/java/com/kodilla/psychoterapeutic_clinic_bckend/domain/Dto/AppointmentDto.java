package com.kodilla.psychoterapeutic_clinic_bckend.domain.Dto;

import com.kodilla.psychoterapeutic_clinic_bckend.domain.Therapist;
import com.kodilla.psychoterapeutic_clinic_bckend.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDto {
    private Therapist therapistId;
    private User user;
    private long id;
    private LocalDate startDate;
    private LocalDate finishDate;
    private String comment;
}

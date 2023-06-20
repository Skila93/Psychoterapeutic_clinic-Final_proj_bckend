package com.kodilla.psychoterapeutic_clinic_bckend.service;

import com.kodilla.psychoterapeutic_clinic_bckend.domain.Appointment;
import com.kodilla.psychoterapeutic_clinic_bckend.repository.AppointmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentRepository repository;
    public Appointment saveAppointment(Appointment appointment){
        return repository.save(appointment);
    }
    public void deleteAppointmentById(final long id){
        repository.deleteById(id);
    }
}
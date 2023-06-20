package com.kodilla.psychoterapeutic_clinic_bckend.mapper;

import com.kodilla.psychoterapeutic_clinic_bckend.domain.Appointment;
import com.kodilla.psychoterapeutic_clinic_bckend.domain.Dto.AppointmentDto;
import org.springframework.stereotype.Service;

@Service
public class AppointmentMapper {

    public Appointment mapToAppointment(AppointmentDto dto){
        return new Appointment(dto.getTherapistId(), dto.getUser(), dto.getId(), dto.getStartDate(), dto.getFinishDate(), dto.getComment());
    }

    public AppointmentDto mapToAppointmentDto(Appointment appointment){
        return new AppointmentDto(appointment.getTherapistId(), appointment.getUser(), appointment.getId(), appointment.getStartDate(), appointment.getFinishDate(), appointment.getComment());
    }
}
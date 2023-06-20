package com.kodilla.psychoterapeutic_clinic_bckend.mapper;

import com.kodilla.psychoterapeutic_clinic_bckend.domain.Dto.TherapistDto;
import com.kodilla.psychoterapeutic_clinic_bckend.domain.Therapist;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TherapistMapper {
    public Therapist mapToTherapist(TherapistDto dto){
        return new Therapist(dto.getId(), dto.getFirstName(), dto.getLastName(),/*, dto.getPosition(),*/ dto.getRate(), dto.getAppointments()/*, dto.getCalendar()*/);
    }

    public TherapistDto mapToTherapistDto(Therapist therapist){
        return new TherapistDto(therapist.getId(), therapist.getFirstName(), therapist.getLastName(),/*, therapist.getPositionId(),*/ therapist.getRate(),therapist.getAppointments()/*, therapist.getCalendar()*/);
    }
    public List<TherapistDto> mapToTherapistDtoList(List<Therapist> therapists){
        return therapists.stream().map(this::mapToTherapistDto).collect(Collectors.toList());
    }
}
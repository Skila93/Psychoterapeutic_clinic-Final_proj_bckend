package com.kodilla.psychoterapeutic_clinic_bckend.mapper;

import com.kodilla.psychoterapeutic_clinic_bckend.domain.Dto.RateDto;
import com.kodilla.psychoterapeutic_clinic_bckend.domain.Rate;
import com.kodilla.psychoterapeutic_clinic_bckend.domain.Therapist;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RateMapper {
    public RateDto mapToRateDto(Rate rate){
        return new RateDto(rate.getId(), rate.getGrade(), rate.getOpinion(), rate.getTherapistAnswer(), rate.getTherapist());
    }

    public Rate mapToRate(RateDto rateDto){
        return new Rate(rateDto.getId(), rateDto.getGrade(), rateDto.getOpinion(), rateDto.getTherapistAnswer(), rateDto.getTherapist());
    }
}
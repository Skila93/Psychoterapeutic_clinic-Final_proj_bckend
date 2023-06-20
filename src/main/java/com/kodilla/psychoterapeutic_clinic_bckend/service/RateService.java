package com.kodilla.psychoterapeutic_clinic_bckend.service;

import com.kodilla.psychoterapeutic_clinic_bckend.domain.Rate;
import com.kodilla.psychoterapeutic_clinic_bckend.repository.RateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RateService {
    private final RateRepository repository;
    public void saveRate(Rate rate){
        repository.save(rate);
    }
    public List<Rate> getAllRatesOfTherapistByItsId(Long therapistId){
        return repository.findAllByTherapistId(therapistId);
    }
    public BigDecimal getTherapistMeanGrade(Long therapistId){
        BigDecimal sumToAverage = getAllRatesOfTherapistByItsId(therapistId).stream().map(Rate::getGrade).reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal average = sumToAverage.divide(new BigDecimal(getAllRatesOfTherapistByItsId(therapistId).size()), new MathContext(2));
        return average;
    }
}

package com.kodilla.psychoterapeutic_clinic_bckend.controller;


import com.kodilla.psychoterapeutic_clinic_bckend.domain.Dto.RateDto;
import com.kodilla.psychoterapeutic_clinic_bckend.domain.Rate;
import com.kodilla.psychoterapeutic_clinic_bckend.mapper.RateMapper;
import com.kodilla.psychoterapeutic_clinic_bckend.service.RateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("clinic/v1/rate")
@RequiredArgsConstructor
public class RateController {
    private final RateMapper mapper;
    private final RateService service;

    @GetMapping(value = "/average/{therapistId}")
    public ResponseEntity<BigDecimal> getTherapistMeanGrade(@PathVariable final long therapistId){
        BigDecimal average = service.getTherapistMeanGrade(therapistId);
        return ResponseEntity.ok(average);
    }
    @GetMapping(value = "/allGrades/{therapistId}")
    public ResponseEntity<List<BigDecimal>> getAllTherapistGrades(@PathVariable final long therapistId){
        List<BigDecimal> gradesList = service.getAllRatesOfTherapistByItsId(therapistId).stream().map(Rate::getGrade).collect(Collectors.toList());
        return ResponseEntity.ok(gradesList);
    }
    @PostMapping(value = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addTherapistRate(@RequestBody RateDto dto){
        service.saveRate(mapper.mapToRate(dto));
        return ResponseEntity.ok().build();
    }
    @PutMapping(value = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addTherapistsComment(@RequestBody RateDto dto) {
        service.saveRate(mapper.mapToRate(dto));
        return ResponseEntity.ok().build();
    }
}
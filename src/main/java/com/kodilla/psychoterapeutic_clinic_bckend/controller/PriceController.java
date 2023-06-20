package com.kodilla.psychoterapeutic_clinic_bckend.controller;

import com.kodilla.psychoterapeutic_clinic_bckend.domain.Dto.PriceDto;
import com.kodilla.psychoterapeutic_clinic_bckend.mapper.PriceMapper;
import com.kodilla.psychoterapeutic_clinic_bckend.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clinic/v1/price")
@RequiredArgsConstructor
public class PriceController {
    /*private final PriceService service;
    private final PriceMapper mapper;
    @PostMapping(value = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addPrice(@RequestBody PriceDto dto){
        service.savePrice(mapper.mapToPrice(dto));
        return ResponseEntity.ok().build();
    }*/
}

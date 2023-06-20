package com.kodilla.psychoterapeutic_clinic_bckend.controller;

import com.kodilla.psychoterapeutic_clinic_bckend.Exceptions.TherapistNotFoundException;
import com.kodilla.psychoterapeutic_clinic_bckend.domain.Dto.TherapistDto;
import com.kodilla.psychoterapeutic_clinic_bckend.mapper.TherapistMapper;
import com.kodilla.psychoterapeutic_clinic_bckend.service.TherapistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clinic/v1/therapist")
@RequiredArgsConstructor
public class TherapistController {
    private final TherapistService service;
    private final TherapistMapper mapper;

    @GetMapping
    public ResponseEntity<List<TherapistDto>> getTherapistList() {
        return ResponseEntity.ok(mapper.mapToTherapistDtoList(service.getTherapists()));
    }

    @GetMapping(value = "{therapistId}")
    public ResponseEntity<TherapistDto> getTherapist(@PathVariable final Long therapistId) throws TherapistNotFoundException {
        return ResponseEntity.ok(mapper.mapToTherapistDto(service.findTherapistById(therapistId)));
    }

    @PostMapping(value = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addTherapist(@RequestBody TherapistDto therapistDto) {
        service.saveTherapist(mapper.mapToTherapist(therapistDto));
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> editTherapist(@RequestBody TherapistDto therapistDto) {
        service.saveTherapist(mapper.mapToTherapist(therapistDto));
        return ResponseEntity.ok().build();
    }
    @DeleteMapping(value = "{therapistId}")
    public ResponseEntity<Void> deleteTherapist(@PathVariable final Long therapistId)throws TherapistNotFoundException{
        service.deleteTherapist(therapistId);
        return ResponseEntity.ok().build();
    }
}
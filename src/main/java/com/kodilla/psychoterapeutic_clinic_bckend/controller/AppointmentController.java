package com.kodilla.psychoterapeutic_clinic_bckend.controller;

import com.kodilla.psychoterapeutic_clinic_bckend.domain.Dto.AppointmentDto;
import com.kodilla.psychoterapeutic_clinic_bckend.mapper.AppointmentMapper;
import com.kodilla.psychoterapeutic_clinic_bckend.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clinic/v1/controller")
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentService service;
    private final AppointmentMapper mapper;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createAppointment(@RequestBody AppointmentDto dto){
        service.saveAppointment(mapper.mapToAppointment(dto));
        return ResponseEntity.ok().build();
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppointmentDto> editAppointment(@RequestBody AppointmentDto dto){
        return ResponseEntity.ok(mapper.mapToAppointmentDto(service.saveAppointment(mapper.mapToAppointment(dto))));
    }

    @DeleteMapping(value = "{taskId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long taskId){
        service.deleteAppointmentById(taskId);
        return ResponseEntity.ok().build();
    }
}
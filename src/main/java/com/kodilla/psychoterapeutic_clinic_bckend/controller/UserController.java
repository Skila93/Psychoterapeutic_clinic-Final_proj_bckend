package com.kodilla.psychoterapeutic_clinic_bckend.controller;

import com.kodilla.psychoterapeutic_clinic_bckend.Exceptions.UserNotFoundException;
import com.kodilla.psychoterapeutic_clinic_bckend.mapper.UserMapper;
import com.kodilla.psychoterapeutic_clinic_bckend.domain.Dto.UserDto;
import com.kodilla.psychoterapeutic_clinic_bckend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clinic/v1/user/")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;
    private final UserMapper mapper;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createUser(@RequestBody UserDto dto){
        service.saveUser(mapper.mapToUser(dto));
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "{taskId}")
    public ResponseEntity<UserDto> getUser(@PathVariable Long taskId) throws UserNotFoundException {
        return ResponseEntity.ok(mapper.mapToUserDto(service.findUserById(taskId)));
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDto> editUser(@RequestBody UserDto dto){
        return ResponseEntity.ok(mapper.mapToUserDto(service.saveUser(mapper.mapToUser(dto))));
    }

    @DeleteMapping(value = "{taskId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long taskId) throws UserNotFoundException{
        service.deleteUserById(taskId);
        return ResponseEntity.ok().build();
    }
}
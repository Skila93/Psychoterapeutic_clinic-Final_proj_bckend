package com.kodilla.psychoterapeutic_clinic_bckend.mapper;

import com.kodilla.psychoterapeutic_clinic_bckend.domain.Dto.UserDto;
import com.kodilla.psychoterapeutic_clinic_bckend.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    public User mapToUser(UserDto dto){
        return new User(dto.getId(), dto.getFirstName(), dto.getLastName(), dto.getEmailAddress(), dto.getPhoneNumber());
    }

    public UserDto mapToUserDto(User user){
        return new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getEmailAddress(), user.getPhoneNumber());
    }
}
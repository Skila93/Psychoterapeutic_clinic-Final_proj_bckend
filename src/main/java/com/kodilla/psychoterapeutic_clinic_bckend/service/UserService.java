package com.kodilla.psychoterapeutic_clinic_bckend.service;

import com.kodilla.psychoterapeutic_clinic_bckend.Exceptions.UserNotFoundException;
import com.kodilla.psychoterapeutic_clinic_bckend.domain.User;
import com.kodilla.psychoterapeutic_clinic_bckend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User saveUser(User user){
         return userRepository.save(user);
    }
    public User findUserById(final long id) throws UserNotFoundException {
        return userRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }
    public void deleteUserById(final long id){
        userRepository.deleteById(id);
    }
}
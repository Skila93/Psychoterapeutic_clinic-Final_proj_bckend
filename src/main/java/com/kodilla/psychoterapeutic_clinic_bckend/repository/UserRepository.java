package com.kodilla.psychoterapeutic_clinic_bckend.repository;

import com.kodilla.psychoterapeutic_clinic_bckend.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
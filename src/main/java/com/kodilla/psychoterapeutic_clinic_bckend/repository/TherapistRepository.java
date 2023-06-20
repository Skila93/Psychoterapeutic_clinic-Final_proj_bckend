package com.kodilla.psychoterapeutic_clinic_bckend.repository;

import com.kodilla.psychoterapeutic_clinic_bckend.domain.Therapist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TherapistRepository extends CrudRepository<Therapist, Long> {
    @Override
    List<Therapist> findAll();

    @Override
    Optional<Therapist> findById(Long aLong);
}
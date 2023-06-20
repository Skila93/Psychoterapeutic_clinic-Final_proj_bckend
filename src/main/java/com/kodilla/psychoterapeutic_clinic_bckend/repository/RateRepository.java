package com.kodilla.psychoterapeutic_clinic_bckend.repository;

import com.kodilla.psychoterapeutic_clinic_bckend.domain.Rate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RateRepository extends CrudRepository<Rate, Long> {
    List<Rate> findAllByTherapistId(Long therapistId);
}
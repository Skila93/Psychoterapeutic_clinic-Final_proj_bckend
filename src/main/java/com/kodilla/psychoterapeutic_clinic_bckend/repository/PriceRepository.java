package com.kodilla.psychoterapeutic_clinic_bckend.repository;

import com.kodilla.psychoterapeutic_clinic_bckend.domain.Price;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends CrudRepository<Price, Long> {
}
package com.kodilla.psychoterapeutic_clinic_bckend.service;

import com.kodilla.psychoterapeutic_clinic_bckend.Exceptions.TherapistNotFoundException;
import com.kodilla.psychoterapeutic_clinic_bckend.domain.Therapist;
import com.kodilla.psychoterapeutic_clinic_bckend.repository.TherapistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TherapistService {
    private final TherapistRepository repository;

    public List<Therapist> getTherapists(){
        return repository.findAll();
    }
    public void saveTherapist(Therapist therapist){
        repository.save(therapist);
    }
    public void deleteTherapist(final Long id){
        repository.deleteById(id);
    }
    public Therapist findTherapistById(final Long id) throws TherapistNotFoundException {
        return repository.findById(id).orElseThrow(TherapistNotFoundException::new);
    }
}
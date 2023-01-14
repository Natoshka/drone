package com.interview.drone.dao.impl;

import com.interview.drone.dao.MedicationDao;
import com.interview.drone.entity.Medication;
import com.interview.drone.repository.MedicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class MedicationDaoImpl implements MedicationDao {

    private final MedicationRepository medicationRepository;

    @Override
    public List<Medication> getMedications() {
        return medicationRepository.findAll(Sort.by("id"));
    }

    @Override
    public Medication save(Medication medication) {
        return medicationRepository.save(medication);
    }

    @Override
    public Set<Medication> getMedicationByIds(List<Long> medicationIds) {
        return new HashSet<>(medicationRepository.findAllById(medicationIds));
    }
}

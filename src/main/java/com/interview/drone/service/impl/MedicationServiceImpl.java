package com.interview.drone.service.impl;

import com.interview.drone.dao.MedicationDao;
import com.interview.drone.entity.Medication;
import com.interview.drone.service.MedicationService;
import com.interview.drone.validator.MedicationValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicationServiceImpl implements MedicationService {

    private final MedicationDao medicationDao;
    private final MedicationValidator medicationValidator;

    @Override
    public List<Medication> getMedications() {
        return medicationDao.getMedications();
    }

    @Override
    @Transactional
    public Medication addMedication(Medication medication) {
        medicationValidator.validate(medication);
        return medicationDao.save(medication);
    }
}

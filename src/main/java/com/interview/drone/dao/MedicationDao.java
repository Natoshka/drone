package com.interview.drone.dao;

import com.interview.drone.entity.Medication;

import java.util.List;
import java.util.Set;

public interface MedicationDao {

    List<Medication> getMedications();

    Medication save(Medication medication);

    Set<Medication> getMedicationByIds(List<Long> medicationIds);
}

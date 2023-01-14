package com.interview.drone.dao;

import com.interview.drone.entity.Medication;

import java.util.List;

public interface MedicationDao {

    List<Medication> getMedications();

    Medication save(Medication medication);
}

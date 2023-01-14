package com.interview.drone.service;

import com.interview.drone.entity.Medication;

import java.util.List;

public interface MedicationService {

    List<Medication> getMedications();

    Medication addMedication(Medication medication);
}

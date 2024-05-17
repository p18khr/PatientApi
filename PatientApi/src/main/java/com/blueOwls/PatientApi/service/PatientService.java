package com.blueOwls.PatientApi.service;
import com.blueOwls.PatientApi.models.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {

	Patient savePatient(Patient patient);

	List<Patient> getAll();

	Patient getOne(int id);

	List<Patient> getByName(String name);
}

package com.blueOwls.PatientApi.service;

import com.blueOwls.PatientApi.models.Appointment;
import com.blueOwls.PatientApi.models.Patient;

import java.util.List;
import java.util.Optional;

public interface AppointmentService {

	List<Appointment> getOne(int patient_id);
}

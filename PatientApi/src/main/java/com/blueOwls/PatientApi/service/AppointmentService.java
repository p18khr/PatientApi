package com.blueOwls.PatientApi.service;

import com.blueOwls.PatientApi.models.Appointment;
import com.blueOwls.PatientApi.models.Patient;

import java.util.List;
import java.util.Optional;

public interface AppointmentService {

	Appointment saveAppointment(Appointment appointment);

	List<Appointment> getAll();

	Optional<Appointment> getOne(int id);
}

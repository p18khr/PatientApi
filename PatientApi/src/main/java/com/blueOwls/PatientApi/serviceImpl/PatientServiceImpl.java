package com.blueOwls.PatientApi.serviceImpl;

import com.blueOwls.PatientApi.dao.AppointmentRepository;
import com.blueOwls.PatientApi.dao.PatientRepository;
import com.blueOwls.PatientApi.models.Appointment;
import com.blueOwls.PatientApi.models.Patient;
import com.blueOwls.PatientApi.service.PatientService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository repo;

	@Autowired
	private AppointmentRepository Apprepo;

	@Override
	public Patient savePatient(Patient patient) {
		Appointment appointment = new Appointment();
		appointment.setPatient_id(patient.getId());
		appointment.setDate(patient.getDate());
		appointment.setTime(patient.getTime());
		Apprepo.save(appointment);
		repo.save(patient);
		return patient;
	}

	@Override
	public List<Patient> getAll() {
    List<Patient> patients = repo.findAll();
	return patients;
	}

	@Override
	public Patient getOne(int id) {
		Patient patient = repo.findPatient(id);
		patient.setAppointments(Apprepo.findAppointment(id));
        return patient;
	}
}

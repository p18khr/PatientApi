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
        List<Appointment> appointments = Apprepo.findAll();
		List<Appointment> finalList = new ArrayList<>();

		for (int i=0;i<appointments.size();i++){
                if(id == appointments.get(i).getPatient_id()){
					 finalList.add(appointments.get(i));
                }
		}
		patient.setAppointments(finalList);
        return patient;
	}
}

package com.blueOwls.PatientApi.serviceImpl;

import com.blueOwls.PatientApi.dao.AppointmentRepository;
import com.blueOwls.PatientApi.models.Appointment;
import com.blueOwls.PatientApi.models.Patient;
import com.blueOwls.PatientApi.service.AppointmentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {


	@Autowired
	private AppointmentRepository repo;


	@Override
	public Appointment saveAppointment(Appointment appointment) {
		repo.save(appointment);
		return appointment;
	}

	@Override
	public List<Appointment> getAll() {
		List<Appointment> appointments = repo.findAll();
		return appointments;
	}

	@Override
	public Optional<Appointment> getOne(int id) {
		return repo.findById(id);
	}
}

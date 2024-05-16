package com.blueOwls.PatientApi.controller;


import com.blueOwls.PatientApi.models.Appointment;
import com.blueOwls.PatientApi.models.Patient;
import com.blueOwls.PatientApi.service.AppointmentService;
import com.blueOwls.PatientApi.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/patient")
public class patientController {

	@Autowired
	private PatientService service;

	@PostMapping
	public Patient savePatient(@RequestBody Patient patient){
		service.savePatient(patient);
		return patient;
	}

	@GetMapping("/{id}")
	public Patient getPatient(@PathVariable int id){

		return service.getOne(id);
	}

	@GetMapping
	public List<Patient> getAll(){
		return service.getAll();
	}


}

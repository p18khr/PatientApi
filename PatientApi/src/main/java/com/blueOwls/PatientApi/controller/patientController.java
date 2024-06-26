package com.blueOwls.PatientApi.controller;


import com.blueOwls.PatientApi.models.Patient;
import com.blueOwls.PatientApi.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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



	@GetMapping
	public List<Patient> getAll(){
		return service.getAll();
	}


}

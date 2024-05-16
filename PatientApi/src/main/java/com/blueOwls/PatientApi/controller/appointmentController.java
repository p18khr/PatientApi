package com.blueOwls.PatientApi.controller;

import com.blueOwls.PatientApi.models.Appointment;
import com.blueOwls.PatientApi.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/appointment")
public class appointmentController {

	@Autowired
	private AppointmentService service;


//	@GetMapping("/{patient_id}")
//	public List<Appointment> getAppointment(@PathVariable int patient_id){
//
//		return service.getOne(patient_id);
//	}

//	@GetMapping
//	public List<Appointment> getAll(){
//
//		return service.getAll();
//	}

}

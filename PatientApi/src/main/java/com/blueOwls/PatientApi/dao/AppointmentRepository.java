package com.blueOwls.PatientApi.dao;

import com.blueOwls.PatientApi.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {
}

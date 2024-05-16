package com.blueOwls.PatientApi.dao;

import com.blueOwls.PatientApi.models.Appointment;
import com.blueOwls.PatientApi.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {
	@Query(value = "select * from Appointment u where u.patient_id = :patient_id",nativeQuery = true)
	List<Appointment> findAppointment(@Param(value = "patient_id")int patient_id);
}

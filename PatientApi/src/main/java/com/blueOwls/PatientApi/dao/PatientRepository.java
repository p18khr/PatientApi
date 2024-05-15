package com.blueOwls.PatientApi.dao;

import com.blueOwls.PatientApi.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Integer> {
	@Query(value = "select * from Patient u where u.id = :id",nativeQuery = true)
	Patient findPatient(@Param(value = "id")int id);
}

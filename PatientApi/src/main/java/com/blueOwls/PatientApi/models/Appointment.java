package com.blueOwls.PatientApi.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="appointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;


	Date date;
	Time time;
	float fee;

	@Column(name = "patientId")
	int patient_id;

}

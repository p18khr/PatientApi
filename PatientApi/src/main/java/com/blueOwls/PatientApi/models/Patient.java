package com.blueOwls.PatientApi.models;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="patient")
public class Patient {


	@Id
	int id;

	String name;
	String phone;
	String email;
	int age;

	@Transient
	String date;

	@Transient
	String time;


	@Transient
	List<Appointment> appointments;

}

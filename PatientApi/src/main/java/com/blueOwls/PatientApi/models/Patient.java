package com.blueOwls.PatientApi.models;


import jakarta.persistence.*;
import lombok.*;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	String name;
	String phone;
	String email;
	int age;

	@Transient
	List<Appointment> appointments;

}

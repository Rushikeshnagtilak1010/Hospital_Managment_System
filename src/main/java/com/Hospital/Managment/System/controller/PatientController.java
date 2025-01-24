package com.Hospital.Managment.System.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital.Managment.System.entity.Patient;
import com.Hospital.Managment.System.repository.PatientRepository;
@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class PatientController {
   
	
	private PatientRepository patientRepository;

	public PatientController(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}
	@PostMapping("/insert")
	public Patient createpatient(@RequestBody Patient  patient ) {
		
		return patientRepository.save(patient);
	}
	@GetMapping
	public List<Patient>getAllPatient(){
		return patientRepository.findAll();
		
	}
}

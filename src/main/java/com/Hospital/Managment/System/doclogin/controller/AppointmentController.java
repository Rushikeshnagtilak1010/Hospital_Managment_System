package com.Hospital.Managment.System.doclogin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital.Managment.System.doclogin.entity.Appointment;
import com.Hospital.Managment.System.doclogin.repository.AppointmentRespository;
@CrossOrigin(origins ="http://localhost:4200")

@RestController
@RequestMapping("/api/v2")
public class AppointmentController {
	
	private AppointmentRespository appointmentRespository;

	public AppointmentController(AppointmentRespository appointmentRespository) {
		super();
		this.appointmentRespository = appointmentRespository;
	}
	
	@PostMapping("/insert")
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		
		return appointmentRespository.save(appointment);
	}
	@GetMapping
	public List<Appointment>getAllAppointments(){
		return appointmentRespository.findAll();
	}

}

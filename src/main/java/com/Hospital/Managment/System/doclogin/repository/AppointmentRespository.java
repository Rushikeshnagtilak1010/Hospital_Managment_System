package com.Hospital.Managment.System.doclogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital.Managment.System.doclogin.entity.Appointment;

@Repository
public interface AppointmentRespository extends JpaRepository<Appointment, Long> {

}

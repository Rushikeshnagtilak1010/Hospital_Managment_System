package com.Hospital.Managment.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital.Managment.System.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}

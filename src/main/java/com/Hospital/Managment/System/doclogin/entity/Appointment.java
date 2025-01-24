package com.Hospital.Managment.System.doclogin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String symtomps;
	
	private String number;

	public Appointment(long id, String name, String symtomps, String number) {
		super();
		this.id = id;
		this.name = name;
		this.symtomps = symtomps;
		this.number = number;
	}

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymtomps() {
		return symtomps;
	}

	public void setSymtomps(String symtomps) {
		this.symtomps = symtomps;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	

}

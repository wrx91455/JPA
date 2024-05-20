package com.capgemini.wsb.persistence.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PATIENT")
public class PatientEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String firstName;
	private String lastName;
	private String telephoneNumber;
	private String email;
	private String patientNumber;
	private LocalDate dateOfBirth;
	private int age; // new field

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private AddressEntity address;

	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
	private List<VisitEntity> visits = new ArrayList<>();

	// Getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	public List<VisitEntity> getVisits() {
		return visits;
	}

	public void setVisits(List<VisitEntity> visits) {
		this.visits = visits;
	}
}

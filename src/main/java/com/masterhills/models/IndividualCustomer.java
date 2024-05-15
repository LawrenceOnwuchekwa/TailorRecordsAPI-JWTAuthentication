package com.masterhills.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="individualCustomer")
public class IndividualCustomer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int individualId;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="address")
	private String address;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="measurement")
	private String measurement;
	
	@ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

	public IndividualCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public IndividualCustomer(int individualId, String firstname, String address, int age, String gender,
			String measurement, Customer customer) {
		super();
		this.individualId = individualId;
		this.firstname = firstname;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.measurement = measurement;
		this.customer = customer;
	}

	public int getIndividualId() {
		return individualId;
	}

	public void setIndividualId(int individualId) {
		this.individualId = individualId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMeasurement() {
		return measurement;
	}

	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}
	

}

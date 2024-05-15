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
@Table(name="familyCustomer")
public class FamilyCustomer{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int familyId;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="familyname")
	private String familyName;
	
	@Column(name="age")
	private int age;
	
	@Column(name="address")
	private String address;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="measurement")
	private String measurement;
	
	@ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
	

	public FamilyCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FamilyCustomer(int familyId, String firstname, String familyName, int age, String address, String gender,
			String measurement, Customer customer) {
		super();
		this.familyId = familyId;
		this.firstname = firstname;
		this.familyName = familyName;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.measurement = measurement;
		this.customer = customer;
	}

	public int getFamilyId() {
		return familyId;
	}

	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public int getAge() {
		return age;
		
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


}

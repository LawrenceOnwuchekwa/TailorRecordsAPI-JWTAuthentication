package com.masterhills.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="customers")
public class Customer {
	
	@Id
	@Column(name="customer_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Enumerated(value=EnumType.STRING)
	private Role role;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<IndividualCustomer> individualAccounts = new HashSet<>();
	 
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<FamilyCustomer> familyAccounts = new HashSet<>();

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int id, String username, String password, Role role, Set<IndividualCustomer> individualAccounts,
			Set<FamilyCustomer> familyAccounts) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.individualAccounts = individualAccounts;
		this.familyAccounts = familyAccounts;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Set<IndividualCustomer> getIndividualAccounts() {
		return individualAccounts;
	}

	public void setIndividualAccounts(Set<IndividualCustomer> individualAccounts) {
		this.individualAccounts = individualAccounts;
	}

	public Set<FamilyCustomer> getFamilyAccounts() {
		return familyAccounts;
	}

	public void setFamilyAccounts(Set<FamilyCustomer> familyAccounts) {
		this.familyAccounts = familyAccounts;
	}
		

}

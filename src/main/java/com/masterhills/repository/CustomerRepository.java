package com.masterhills.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masterhills.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	
	Optional<Customer> findByUsername(String Username);

}

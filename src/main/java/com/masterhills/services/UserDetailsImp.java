package com.masterhills.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.masterhills.models.WrapperCustomer;
import com.masterhills.repository.CustomerRepository;

public class UserDetailsImp implements UserDetailsService{

	
	private final CustomerRepository customerRepository;
	
	
	public UserDetailsImp(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		var u = customerRepository.findByUsername(username);
		// TODO Auto-generated method stub
		return u.map(WrapperCustomer::new)
				.orElseThrow(()->new UsernameNotFoundException("user not found"));
	}

}

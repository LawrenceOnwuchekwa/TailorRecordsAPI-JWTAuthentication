package com.masterhills.services;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.masterhills.models.AuthenticationResponse;
import com.masterhills.models.Customer;
import com.masterhills.repository.CustomerRepository;

public class AuthenticationService {

	private final CustomerRepository customerRepository;

    private final PasswordEncoder passwordEncoder;
    
    private final JwtService jwtService;

    private final AuthenticationManager authenticationManager;

	public AuthenticationService(CustomerRepository customerRepository, PasswordEncoder passwordEncoder,
			JwtService jwtService, AuthenticationManager authenticationManager) {
		super();
		this.customerRepository = customerRepository;
		this.passwordEncoder = passwordEncoder;
		this.jwtService = jwtService;
		this.authenticationManager = authenticationManager;
	}
    
    
    public AuthenticationResponse register(Customer request){
        Customer customer = new Customer();
        customer.setUsername(request.getUsername());
        customer.setPassword(passwordEncoder.encode(request.getPassword()));
        customer.setRole(request.getRole());
        customer = customerRepository.save(customer);

        String token = jwtService.generateToken(customer);

        return new AuthenticationResponse(token);

    }
    public AuthenticationResponse authenticate(Customer request){
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );

        Customer customer = customerRepository.findByUsername(request.getUsername()).orElseThrow();
        String token = jwtService.generateToken(customer);

        return new AuthenticationResponse(token);
    }

}

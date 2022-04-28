package com.zscalerlabsession.zscalerlabsession.controllers;


import com.zscalerlabsession.zscalerlabsession.Model.Customers;
import com.zscalerlabsession.zscalerlabsession.security.JwtUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController
{
   

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUtils jwtUtils;

    @GetMapping("/testing")
    public String testing(){
        return "Testing";
    }

    @PostMapping("/createCustomer")
	public ResponseEntity<Object> createCustomer(@RequestBody Customers Customers){
		
		Customers fetchAdmin = authSerivce.fetchAdminByEmail(Customers.getEmailId());
		
		if(fetchCustomer == null) {
			Customers admin = authSerivce.createCustomer(Customers);
			
			CustomersResponse response = new CustomersResponse(new Date(),"Customer Created Succesfully","200",admin);
			
			return new ResponseEntity<Object>(response,HttpStatus.OK);
		}else {
			
			CustomResponseForNoUser response = new CustomResponseForNoUser(new Date(),"Email id already exists","409");
			return new ResponseEntity<Object>(response,HttpStatus.OK);
			
		}	
		
	}

}

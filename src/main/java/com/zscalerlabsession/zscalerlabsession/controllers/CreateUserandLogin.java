package com.zscalerlabsession.zscalerlabsession.controllers;


import com.zscalerlabsession.zscalerlabsession.security.JwtUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateUserandLogin
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
	public ResponseEntity<Object> createCustomer(@RequestBody CustomerDetails customerDetails){
		
		CustomerDetails fetchAdmin = authSerivce.fetchAdminByEmail(customerDetails.getEmailId());
		
		if(fetchCustomer == null) {
			CustomerDetails admin = authSerivce.createCustomer(customerDetails);
			
			CustomerDetailsResponse response = new CustomerDetailsResponse(new Date(),"Customer Created Succesfully","200",admin);
			
			return new ResponseEntity<Object>(response,HttpStatus.OK);
		}else {
			
			CustomResponseForNoUser response = new CustomResponseForNoUser(new Date(),"Email id already exists","409");
			return new ResponseEntity<Object>(response,HttpStatus.OK);
			
		}	
		
	}

}

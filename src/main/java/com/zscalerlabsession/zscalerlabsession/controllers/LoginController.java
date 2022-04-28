package com.zscalerlabsession.zscalerlabsession.controllers;

import com.zscalerlabsession.zscalerlabsession.Model.Customer;
import com.zscalerlabsession.zscalerlabsession.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.zscalerlabsession.zscalerlabsession.service.AuthService;

@RestController
public class LoginController {


    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    AuthService authService;

    @Autowired
    PasswordEncoder encoder;


    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody Customer customer)
    {
        Customer fetchCustomer = authService.fetchCustomerByEmail(customer.getEmailId());

        if(fetchCustomer!=null)
        {
            if(encoder.matches(customer.getPassword(), fetchCustomer.getPassword()))
            {

            }
        }
        return null;
    }


}

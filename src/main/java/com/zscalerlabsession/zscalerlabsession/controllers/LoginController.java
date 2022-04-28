package com.zscalerlabsession.zscalerlabsession.controllers;

import com.zscalerlabsession.zscalerlabsession.Model.Customers;
import com.zscalerlabsession.zscalerlabsession.Repository.CustomerRepository;
import com.zscalerlabsession.zscalerlabsession.response.CustomResponseForLogin;
import com.zscalerlabsession.zscalerlabsession.security.JwtUtils;
import com.zscalerlabsession.zscalerlabsession.serviceimpl.AuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zscalerlabsession.zscalerlabsession.service.AuthService;

import java.util.Date;

@RestController
public class LoginController {


    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    AuthService authService;

    @Autowired
    PasswordEncoder encoder;


    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody Customers customer)
    {
        Customers fetchCustomer = authService.fetchCustomerByEmail(customer.getEmailId());

        if(fetchCustomer!=null)
        {
            if(encoder.matches(customer.getPassword(), fetchCustomer.getPassword()))
            {

            }
        }
        return null;
    }


}

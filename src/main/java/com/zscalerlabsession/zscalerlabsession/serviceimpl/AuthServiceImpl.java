package com.zscalerlabsession.zscalerlabsession.serviceimpl;

import com.zscalerlabsession.zscalerlabsession.Model.Customers;
import com.zscalerlabsession.zscalerlabsession.Repository.CustomerRepository;
import com.zscalerlabsession.zscalerlabsession.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class AuthServiceImpl implements AuthService {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    PasswordEncoder encoder;

    @Override
    public Customers createCustomer(Customers customerDetails) {
        // TODO Auto-generated method stub

        customerDetails.setPassword(encoder.encode(customerDetails.getPassword()));

        return customerRepository.save(customerDetails);
    }

    @Override
    public Customers fetchCustomerByEmail(String emailId) {
        // TODO Auto-generated method stub
        return customerRepository.fetchCustomerByEmail(emailId);
    }
}

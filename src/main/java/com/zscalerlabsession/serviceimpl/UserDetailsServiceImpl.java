package com.zscalerlabsession.serviceimpl;

import com.zscalerlabsession.Model.Customers;
import com.zscalerlabsession.Repository.CustomerRepository;
import com.zscalerlabsession.security.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String emailId)throws UsernameNotFoundException
    {
        Customers customer = customerRepository.fetchCustomerByEmail(emailId);
        if(customer == null)
        {
            throw new UsernameNotFoundException("Customer with this email not found");
        }
        return UserDetailsImpl.build(customer);
    }

}

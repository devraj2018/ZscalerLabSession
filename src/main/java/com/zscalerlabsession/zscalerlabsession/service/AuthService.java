package com.zscalerlabsession.zscalerlabsession.service;

import com.zscalerlabsession.zscalerlabsession.Model.Customer;

public interface AuthService
{
    Customer createCustomer(Customer customerDetails);

    Customer fetchCustomerByEmail(String emailId);
}

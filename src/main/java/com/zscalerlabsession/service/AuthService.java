package com.zscalerlabsession.service;

import com.zscalerlabsession.Model.Customers;

public interface AuthService
{
    Customers createCustomer(Customers customerDetails);

    Customers fetchCustomerByEmail(String emailId);
}

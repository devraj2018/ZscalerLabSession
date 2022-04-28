package com.zscalerlabsession.zscalerlabsession.service;

import com.zscalerlabsession.zscalerlabsession.Model.Customers;

public interface AuthService
{
    Customers createCustomer(Customers customerDetails);

    Customers fetchCustomerByEmail(String emailId);
}

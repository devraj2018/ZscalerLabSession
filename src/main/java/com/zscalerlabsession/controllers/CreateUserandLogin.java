package com.zscalerlabsession.controllers;

import com.zscalerlabsession.Model.AccountDetail;
import com.zscalerlabsession.Model.Customers;
import com.zscalerlabsession.security.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreateUserandLogin
{
    @Autowired
    AccountDetail accountDetail;

    @Autowired
    Customers customers;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUtils jwtUtils;

    @GetMapping("/testing")
    public String testing(){
        return "Testing";
    }

}

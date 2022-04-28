package com.zscalerlabsession.zscalerlabsession.controllers;

import com.zscalerlabsession.zscalerlabsession.Model.Accounts;
import com.zscalerlabsession.zscalerlabsession.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    Accounts account;

    @Autowired
    AccountRepository accountRepository;
}

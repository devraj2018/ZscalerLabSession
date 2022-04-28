package com.zscalerlabsession.security;

import com.zscalerlabsession.Model.Customers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class UserDetailsImpl implements UserDetails
{
    private static final long serialVersionUID = 1L;

    static final Logger log = LoggerFactory.getLogger(UserDetailsImpl.class);

    private String name;
    private String password;
    private long accountnumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(long accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "UserDetailsImpl{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", accountnumber=" + accountnumber +
                ", ifscCode='" + ifscCode + '\'' +
                ", address='" + address + '\'' +
                ", branchName='" + branchName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public UserDetailsImpl(String name, String password, long accountnumber, String ifscCode, String address, String branchName, String emailId) {
        this.name = name;
        this.password = password;
        this.accountnumber = accountnumber;
        this.ifscCode = ifscCode;
        this.address = address;
        this.branchName = branchName;
        this.emailId = emailId;
    }

    private String ifscCode;
    private String address;
    private String branchName;
    private String emailId;

    public static UserDetailsImpl build(Customers customer)
    {
        return new UserDetailsImpl(customer.getName(),customer.getPassword(),customer.getAccountNumber(),customer.getIfscCode(),
                customer.getAddress(),customer.getBranchName(),customer.getEmailId());
    }



}

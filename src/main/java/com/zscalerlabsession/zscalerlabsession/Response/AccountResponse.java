package com.zscalerlabsession.zscalerlabsession.Response;

import com.zscalerlabsession.zscalerlabsession.Model.Accounts;
import org.apache.catalina.connector.Response;

import java.util.Date;

public class AccountResponse{

    private Date timeStamp;
    private String message;
    private String status;
    private Accounts account;

    public AccountResponse() {
        super();
    }

    public AccountResponse(Date timeStamp, String message, String status, Accounts account) {
        this.timeStamp = timeStamp;
        this.message = message;
        this.status = status;
        this.account = account;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Accounts getAccount() {
        return account;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }
}

package com.zscalerlabsession.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long accountNumber;
	private double balance;
	private String type;
	
	
	public AccountDetail() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AccountDetail(long accountNumber, double balance, String type) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.type = type;
		 
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAdminId(long accountNumber) {
		this.accountNumber = accountNumber;
	}

   public double getBalance() {
		return  balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	 


	@Override
	public String toString() {
		return "AccountDetail [account_number=" + accountNumber + ", Balance=" + balance + ", AccountType=" + type +  "]";
	}
	
	

}
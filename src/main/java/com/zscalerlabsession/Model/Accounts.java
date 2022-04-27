package com.zscalerlabsession.Model;

import javax.persistence.*;

@Entity
public class Accounts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private long acnt_no;
	private double balance;
	private String type;
	
	
	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Accounts(Long id, String name, long acnt_no, double balance, String type) {
		super();
		this.id = id;
		this.name = name;
		this.acnt_no = acnt_no;
		this.balance = balance;
		this.type = type;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getAcnt_no() {
		return acnt_no;
	}


	public void setAcnt_no(long acnt_no) {
		this.acnt_no = acnt_no;
	}


	public double getBalance() {
		return balance;
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
		return "Accounts [id=" + id + ", name=" + name + ", acnt_no=" + acnt_no + ", balance=" + balance + ", type="
				+ type + "]";
	}
	
}

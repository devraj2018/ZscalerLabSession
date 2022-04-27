package com.zscalerlabsession.Model;

import javax.persistence.*;

@Entity
public class Transactions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private long acnt_sender;
	private long acnt_receiver;
	private double amount;
	private String status;
	private String date;
	
	
	public Transactions() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Transactions(long id, long acnt_sender, long acnt_receiver, double amount, String status, String date) {
		super();
		this.id = id;
		this.acnt_sender = acnt_sender;
		this.acnt_receiver = acnt_receiver;
		this.amount = amount;
		this.status = status;
		this.date = date;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public long getAcnt_sender() {
		return acnt_sender;
	}


	public void setAcnt_sender(long acnt_sender) {
		this.acnt_sender = acnt_sender;
	}


	public long getAcnt_receiver() {
		return acnt_receiver;
	}


	public void setAcnt_receiver(long acnt_receiver) {
		this.acnt_receiver = acnt_receiver;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Transactions [id=" + id + ", acnt_sender=" + acnt_sender + ", acnt_receiver=" + acnt_receiver
				+ ", amount=" + amount + ", status=" + status + ", date=" + date + "]";
	}
	
	
}

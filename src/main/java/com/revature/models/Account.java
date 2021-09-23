package com.revature.models;

public class Account {

	private int id;
	private String owner;
	private String type;
	private double balance;
	
	public Account() {
		this.balance = 0.0f;
		this.owner = "No owner Selected";
		this.type = "No Account Selected";
				
	}
	
	public Account(int id) {
		this.id = id;
	}
	
	public Account(int id, String owner) {
		this.id = id;
		this.owner = owner;
	}
	
	public Account(int id, String owner, String type, double balance) {
		this.id = id;
		this.owner = owner;
		this.type = type;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance ;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	@Override
	public String toString() { 
		return "[Account # "+ id + " holder: " + owner + " type of Account: " + type +
								" Balance: $" + balance + "] \n";
		
	}
}

package com.sp.model;

import java.util.concurrent.atomic.AtomicInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private final int id;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private int money;
	private static final AtomicInteger ID_FACTORY = new AtomicInteger();
	
	
	
	
	public User() {
		this.id = ID_FACTORY.getAndIncrement();
		this.firstname = "new firstname";
		this.lastname = "new lastname";
		this.username = "new username";
		this.password = "new password";
		this.money = 500;
	}
	
	public User(String firstname, String lastname, String username, String password) {
		this.id = ID_FACTORY.getAndIncrement();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.money = 500;
	}
	

	
	//getter and setter
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname=firstname;
	}
	
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname=lastname;
	}
	
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username=username;
	}
	
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money=money;
	}
	
	
	public int getId() {
		return id;
	}
	

	
	
	@Override
	public String toString() {
		return "USER ["+getId()+"]: name:"+getFirstname()+" "+getLastname()+", money:"+getMoney();
	}


}

package com.sp.model;



public class User {
	private int id;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private int money;
	
	
	public User() {
	}
	
	public User(String firstname, String lastname, String username, String password) {
		super();
		//this.id=id; //TODO 
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
	
	public void setId(int id) {
		this.id=id;
	}
	
	
	@Override
	public String toString() {
		return "USER ["+getId()+"]: name:"+getFirstname()+" "+getLastname()+", money:"+getMoney();
	}


}

package com.dbs.hellorest;

public class User {
	private String userName;
	private String password;
	private String email;
	
	public User() {
		
	}
	
	public void setUserName( String userName ) {
		this.userName = userName;
	}
	
	public void setPassword( String password ) {
		this.password = password;
	}
	
	public void setEmail ( String email ) {
		this.email = email;
	}
}

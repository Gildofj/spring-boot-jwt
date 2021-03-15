package com.store.payload.request;

import java.io.Serializable;

public class SignupRequest implements Serializable{
	
	private static final long serialVersionUID = -5293832938289239233L;
	
	private String username;
	private String email;
	private String password;
	private String role;
	
	public SignupRequest() {
		
	}
	
	public SignupRequest(String username, String email, String password) {
		this.setUsername(username);
		this.setEmail(email);
		this.setPassword(password);
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}

package com.store.payload.response;

import java.io.Serializable;
import java.util.List;


public class JwtResponse implements Serializable {
	private static final long serialVersionUID = -3972724280901470557L;
	
	private final String token;
	private long id;
	private String username;
	private String email;
	private List<String> roles;
	
	public  JwtResponse(String token, long id, String username, String email, List<String> roles) {
		this.token = token;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}
	
	public String getToken() {
		return this.token;
	}
	
	public long getId() {
		return this.id;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public List<String> getRoles() {
		return this.roles;
	}
}

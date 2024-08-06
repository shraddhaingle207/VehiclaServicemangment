package com.artarea.model;

import lombok.Data;

@Data
public class Response {
	
	private String Role;
	private String name;
	
	private String emailId;
	
	private String rolename;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String object) {
		this.rolename = object;
	}

	public String getToken() {
		return token;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	private String uname;
	
	private String pass;
	
	private String token;

	public void setToken(String token2) {
		// TODO Auto-generated method stub
		
	}

	public String getUname() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}

	public String getPass() {
		// TODO Auto-generated method stub
		return null;
	}
	public String setpass() {
		return null;
	}

	public void setEmailId(Object emailId2) {
		// TODO Auto-generated method stub
		
	}

	public void setPass(String pass2) {
		// TODO Auto-generated method stub
		
	}

	public void setRolename(Object rolename2) {
		// TODO Auto-generated method stub
		
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

}

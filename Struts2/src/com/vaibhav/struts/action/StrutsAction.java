package com.vaibhav.struts.action;

import com.opensymphony.xwork2.Action;

public class StrutsAction implements Action {

	@Override
	public String execute() throws Exception {
		System.out.println("Performing validation");
		System.out.println("user: " + getUsername());
		System.out.println("password: " + getPassword());
		if (validateString(getUsername()) && validateString(getPassword()))
			return "SUCCESS";
		else
			return "ERROR";
	}

	// Java Bean to hold the form parameters
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private boolean validateString(String str) {
		if (str != null && !str.equals(""))
			return true;
		return false;
	}
}
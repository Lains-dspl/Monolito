package com.monolito.models;

public class AccountInformation {

	private String username;
	private String password;
	private Boolean isProfileComplete;
	private Boolean isActive;

	/**
	 * @param username
	 * @param password
	 * @param isProfileComplete
	 * @param isActive
	 */
	public AccountInformation(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		this.isProfileComplete = false;
		this.isActive = true;
	}
	
	public AccountInformation() {
		super();
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the isProfileComplete
	 */
	public Boolean getIsProfileComplete() {
		return isProfileComplete;
	}

	/**
	 * @param isProfileComplete the isProfileComplete to set
	 */
	public void setIsProfileComplete(Boolean isProfileComplete) {
		this.isProfileComplete = isProfileComplete;
	}

	/**
	 * @return the isActive
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}

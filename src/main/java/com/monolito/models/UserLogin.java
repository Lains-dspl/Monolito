/**
 * 
 */
package com.monolito.models;

/**
 * @author Camilo Andres Moreno
 *
 */
public class UserLogin {

	private String email;
	private String password;
	private String device;

	public UserLogin() {
		super();
	}

	/**
	 * @param email
	 * @param password
	 */
	public UserLogin(String email, String password, String device) {
		super();
		this.email = email;
		this.password = password;
		this.device = device;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the device
	 */
	public String getDevice() {
		return device;
	}

	/**
	 * @param device the device to set
	 */
	public void setDevice(String device) {
		this.device = device;
	}

}

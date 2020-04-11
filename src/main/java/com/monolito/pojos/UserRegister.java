/**
 * 
 */
package com.monolito.pojos;

/**
 * @author Camilo Andres Moreno
 *
 */
public class UserRegister {

	private String firstName;
	private String companyName;
	private String secondName;
	private String surname;
	private String secondSurname;
	private String email;
	private String password;
	private String passwordVerificated;
	private String role;

	/**
	 * @param firstName
	 * @param secondName
	 * @param surname
	 * @param secondSurname
	 * @param email
	 * @param password
	 * @param passwordVerificated
	 */
	public UserRegister(String firstName, String secondName, String surname, String secondSurname, String email,
			String password, String passwordVerificated, String role, String companyName) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.surname = surname;
		this.secondSurname = secondSurname;
		this.email = email;
		this.password = password;
		this.passwordVerificated = passwordVerificated;
		this.role = role;
		this.companyName = companyName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the secondName
	 */
	public String getSecondName() {
		return secondName;
	}

	/**
	 * @param secondName the secondName to set
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the secondSurname
	 */
	public String getSecondSurname() {
		return secondSurname;
	}

	/**
	 * @param secondSurname the secondSurname to set
	 */
	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
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
	 * @return the passwordVerificated
	 */
	public String getPasswordVerificated() {
		return passwordVerificated;
	}

	/**
	 * @param passwordVerificated the passwordVerificated to set
	 */
	public void setPasswordVerificated(String passwordVerificated) {
		this.passwordVerificated = passwordVerificated;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}

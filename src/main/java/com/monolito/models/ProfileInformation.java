package com.monolito.models;

public class ProfileInformation {

	private String firstName;
	private String companyName;
	private String secondName;
	private String surname;
	private String email;
	private String secondSurname;
	private String role;
	private String gender;
	private DocumentType documentType;
	private String documentNumber;
	private String phone;
	private Department department; 
	private City city;
	private String adress;
	private String image;
	private String companyAssociated;

	/**
	 * 
	 */
	public ProfileInformation() {
		super();
	}

	/**
	 * @param firstName
	 * @param secondName
	 * @param surname
	 * @param secondSurname
	 * @param role
	 */
	public ProfileInformation(String firstName, String secondName, String surname, String secondSurname, String role) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.surname = surname;
		this.secondSurname = secondSurname;
		this.role = role;
	}

	public ProfileInformation(String companyName, String role) {
		super();
		this.companyName = companyName;
		this.role = role;
	}

	/**
	 * @param firstName
	 * @param secondName
	 * @param surname
	 * @param secondSurname
	 * @param role
	 * @param gender
	 * @param documentType
	 * @param documentNumber
	 * @param phone
	 * @param department
	 * @param city
	 * @param adress
	 */
	public ProfileInformation(String firstName, String secondName, String surname, String secondSurname, String role,
			String gender, DocumentType documentType, String documentNumber, String phone, Department department,
			City city, String adress, String email, String image) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.surname = surname;
		this.secondSurname = secondSurname;
		this.role = role;
		this.gender = gender;
		this.documentType = documentType;
		this.documentNumber = documentNumber;
		this.phone = phone;
		this.department = department;
		this.city = city;
		this.adress = adress;
		this.email = email;
		this.image = image;
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
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the documentType
	 */
	public DocumentType getDocumentType() {
		return documentType;
	}

	/**
	 * @param documentType the documentType to set
	 */
	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

	/**
	 * @return the documentNumber
	 */
	public String getDocumentNumber() {
		return documentNumber;
	}

	/**
	 * @param documentNumber the documentNumber to set
	 */
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}

	/**
	 * @return the adress
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * @param adress the adress to set
	 */
	public void setAdress(String adress) {
		this.adress = adress;
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
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAssociated() {
		return companyAssociated;
	}

	public void setCompanyAssociated(String companyAssociated) {
		this.companyAssociated = companyAssociated;
	}

}

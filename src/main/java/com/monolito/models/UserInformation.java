package com.monolito.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class UserInformation {

	@Id
	private String _id;
	private ProfileInformation profileInformation;
	private AccountInformation accountInformation;
	private UserAsociation company;

	/**
	 * @param profileInformation
	 * @param accountInformation
	 */
	public UserInformation(ProfileInformation profileInformation, AccountInformation accountInformation) {
		super();
		this.profileInformation = profileInformation;
		this.accountInformation = accountInformation;
	}

	/**
	 * @param profileInformation
	 * @param accountInformation
	 */
	public UserInformation() {
		super();
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return _id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this._id = id;
	}

	/**
	 * @return the profileInformation
	 */
	public ProfileInformation getProfileInformation() {
		return profileInformation;
	}

	/**
	 * @param profileInformation the profileInformation to set
	 */
	public void setProfileInformation(ProfileInformation profileInformation) {
		this.profileInformation = profileInformation;
	}

	/**
	 * @return the accountInformation
	 */
	public AccountInformation getAccountInformation() {
		return accountInformation;
	}

	/**
	 * @param accountInformation the accountInformation to set
	 */
	public void setAccountInformation(AccountInformation accountInformation) {
		this.accountInformation = accountInformation;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public UserAsociation getCompany() {
		return company;
	}

	public void setCompany(UserAsociation company) {
		this.company = company;
	}

}

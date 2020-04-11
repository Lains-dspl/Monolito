package com.monolito.models;

public class UserAsociation {

	private String _id;
	private ProfileInformation profileInformation;
	private String username;

	/**
	 * @param _id
	 * @param profileInformation
	 * @param username
	 */
	public UserAsociation(UserInformation user) {
		super();
		if (user != null) {
			this._id = user.getId();
			this.profileInformation = user.getProfileInformation();
			this.username = user.getAccountInformation().getUsername();
		}
	}

	/**
	 * @param _id
	 * @param profileInformation
	 * @param username
	 */
	public UserAsociation(String _id, ProfileInformation profileInformation, String username) {
		super();
		this._id = _id;
		this.profileInformation = profileInformation;
		this.username = username;
	}

	public UserAsociation() {
		super();
	}

	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}

	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
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

}

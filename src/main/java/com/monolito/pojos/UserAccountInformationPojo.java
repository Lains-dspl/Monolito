package com.monolito.pojos;

import java.util.ArrayList;
import java.util.List;

import com.monolito.enums.UserPermitsEnum;
import com.monolito.models.AccountInformation;
import com.monolito.models.ProfileInformation;

public class UserAccountInformationPojo {

	private String username;
	private Boolean isProfileComplete;
	private Boolean isActive;
	private List<UserPermitsEnum> userPermits;
	private ProfileInformation profileInformation;

	/**
	 * @param username
	 * @param isProfileComplete
	 * @param isActive
	 */
	public UserAccountInformationPojo(AccountInformation accountInformation, ProfileInformation profileInformation) {
		super();
		this.username = accountInformation.getUsername();
		this.isProfileComplete = accountInformation.getIsProfileComplete();
		this.isActive = accountInformation.getIsActive();
		this.userPermits = new ArrayList<>();
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

	public List<UserPermitsEnum> getUserPermits() {
		return userPermits;
	}

	public void setUserPermits(List<UserPermitsEnum> userPermits) {
		this.userPermits = userPermits;
	}

	public void addUserPermits(UserPermitsEnum userPermit) {
		this.userPermits.add(userPermit);
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
}

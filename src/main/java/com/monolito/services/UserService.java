package com.monolito.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monolito.enums.ErrorCodeEnum;
import com.monolito.enums.UserPermitsEnum;
import com.monolito.models.AccountInformation;
import com.monolito.models.MessageInformation;
import com.monolito.models.ProfileInformation;
import com.monolito.models.UserAsociation;
import com.monolito.models.UserInformation;
import com.monolito.models.UserLogin;
import com.monolito.pojos.UserAccountInformationPojo;
import com.monolito.pojos.UserRegister;
import com.monolito.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public Object userLogin(UserLogin loginInformation) {
		UserInformation user = userRepository.findByProfileUsername(loginInformation.getEmail());
		boolean existingUser = user != null;
		if (existingUser) {
			Boolean matchPassword = user.getAccountInformation().getPassword().equals(loginInformation.getPassword());
			if (!matchPassword) {
				return new MessageInformation(ErrorCodeEnum.INCORRECT_PASSWORD);
			}
		} else {
			return new MessageInformation(ErrorCodeEnum.NOT_EXISTING_USER);
		}

		UserAccountInformationPojo userInformation = new UserAccountInformationPojo(user.getAccountInformation(),
				user.getProfileInformation());

		userInformation.setUserPermits(getUserConfig(user));
		return userInformation;
	}

	private List<UserPermitsEnum> getUserConfig(UserInformation user) {

		List<UserPermitsEnum> permits = new ArrayList<>();

		// Add Generic Permits
		permits.add(UserPermitsEnum.PROFILE);
		permits.add(UserPermitsEnum.NOTIFICATIONS);
		permits.add(UserPermitsEnum.CONSULT_EVENTS);
		String role = user.getProfileInformation().getRole();

		if (role.equals("Alcalde") || role.equals("Governador")) {
			permits.add(UserPermitsEnum.NEWS_UPLOAD);
			permits.add(UserPermitsEnum.NEWS_DOWNLOAD);
			permits.add(UserPermitsEnum.CONTENT_UPLOAD);
			permits.add(UserPermitsEnum.CONTENT_DOWNLOAD);
			permits.add(UserPermitsEnum.CONTENT_VIEW);
			permits.add(UserPermitsEnum.CREATE_EVENTS);
			permits.add(UserPermitsEnum.ATTEND_EVENTS);
			permits.add(UserPermitsEnum.CONSULT_EVENTS);
		} else if (role.equals("Ganadero")) {
			permits.add(UserPermitsEnum.CONTENT_DOWNLOAD);
			permits.add(UserPermitsEnum.CONTENT_VIEW);
			permits.add(UserPermitsEnum.ATTEND_EVENTS);
			permits.add(UserPermitsEnum.CREATE_MILK_REQUEST);
			permits.add(UserPermitsEnum.TRACKING);
			permits.add(UserPermitsEnum.NEWS_DOWNLOAD);
		} else if (role.equals("Empresa")) {
			permits.add(UserPermitsEnum.TRACKING);
			permits.add(UserPermitsEnum.ASOCIATE_MILK_REQUEST);
			permits.add(UserPermitsEnum.CONTENT_DOWNLOAD);
		} else if (role.equals("Veterinario")) {
			permits.add(UserPermitsEnum.CREATE_EVENTS);
			permits.add(UserPermitsEnum.ATTEND_EVENTS);
			permits.add(UserPermitsEnum.CONSULT_EVENTS);
			permits.add(UserPermitsEnum.CONTENT_DOWNLOAD);
		}

		return permits;
	}

	public List<UserInformation> findAll() {
		return userRepository.findAll();
	}

	public UserInformation findById(String idUser) {
		Optional<UserInformation> user = userRepository.findById(idUser);
		return user.isPresent() ? user.get() : null;
	}

	public UserInformation findByUsername(String username) {
		UserInformation user = userRepository.findByProfileUsername(username);
		return user;
	}

	public MessageInformation userRegister(UserRegister userInformation) {
		UserInformation users = userRepository.findByProfileUsername(userInformation.getEmail());
		boolean existingUser = users != null;
		boolean equalPasswords = userInformation.getPassword().equals(userInformation.getPasswordVerificated());

		if (existingUser) {
			return new MessageInformation(ErrorCodeEnum.EXISTING_USER);
		} else if (!equalPasswords) {
			return new MessageInformation(ErrorCodeEnum.NOT_MATCH_PASSWORD);
		}

		UserInformation user = createUser(userInformation);

		userRepository.save(user);

		return null;
	}

	public UserInformation updateProfile(ProfileInformation userInformation) {
		UserInformation user = userRepository.findByProfileUsername(userInformation.getEmail());
		userInformation.setRole(user.getProfileInformation().getRole());
		if (user.getProfileInformation().getRole().equals("Recolector")) {
			UserInformation company = userRepository.findById(userInformation.getCompanyAssociated()).get();
			UserAsociation companyAsociated = new UserAsociation(company);
			user.setCompany(companyAsociated);
		}
		user.setProfileInformation(userInformation);
		user.getAccountInformation().setIsProfileComplete(true);
		userRepository.save(user);

		return user;
	}

	private UserInformation createUser(UserRegister userInformation) {

		ProfileInformation profileInformation = null;
		if (userInformation.getRole().equals("Empresa")) {
			profileInformation = new ProfileInformation(userInformation.getCompanyName(), userInformation.getRole());
		} else {
			profileInformation = new ProfileInformation(userInformation.getFirstName(), userInformation.getSecondName(),
					userInformation.getSurname(), userInformation.getSecondSurname(), userInformation.getRole());
		}

		AccountInformation accountInformation = new AccountInformation(userInformation.getEmail(),
				userInformation.getPassword());
		UserInformation user = new UserInformation(profileInformation, accountInformation);
		return user;
	}

	public void updateProfileImage(String image, String username) {
		UserInformation user = userRepository.findByProfileUsername(username);
		user.getProfileInformation().setImage(image);
		userRepository.save(user);
	}

}

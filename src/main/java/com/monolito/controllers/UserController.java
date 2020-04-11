package com.monolito.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.monolito.models.MessageInformation;
import com.monolito.models.ProfileInformation;
import com.monolito.models.UserInformation;
import com.monolito.models.UserLogin;
import com.monolito.pojos.UserRegister;
import com.monolito.services.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "/login/")
	@ResponseBody
	public ResponseEntity<Object> login(@RequestBody UserLogin request) {

		Object userLogin = userService.userLogin(request);
		if (userLogin.getClass() != MessageInformation.class) {
			return ResponseEntity.status(HttpStatus.OK).body(userLogin);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(userLogin);

		}
	}

	@RequestMapping(value = "/users/findAll", method = RequestMethod.GET)
	public ResponseEntity<List<UserInformation>> findAllUsers() {
		return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
	}

	@RequestMapping(value = "/users/{idUser}", method = RequestMethod.GET)
	public ResponseEntity<UserInformation> findUserById(@PathVariable("idUser") String idUser) {
		UserInformation user = userService.findById(idUser);

		return ResponseEntity.status(HttpStatus.OK).body(user);
	}

	@RequestMapping(value = "/users/getUsername/{username}", method = RequestMethod.GET)
	public ResponseEntity<UserInformation> findUserByUsername(@PathVariable("username") String username) {
		UserInformation user = userService.findByUsername(username);

		return ResponseEntity.status(HttpStatus.OK).body(user);
	}

	@RequestMapping(value = "/users/register", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<MessageInformation> register(@RequestBody UserRegister request) {
		MessageInformation userRegister = userService.userRegister(request);
		if (userRegister == null) {
			return ResponseEntity.status(HttpStatus.OK).body(null);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(userRegister);
		}
	}

	@RequestMapping(value = "/users/updateProfile", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<UserInformation> register(@RequestBody ProfileInformation request) {
		UserInformation userRegister = userService.updateProfile(request);
		if (userRegister != null) {
			return ResponseEntity.status(HttpStatus.OK).body(userRegister);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(userRegister);
		}
	}

	@RequestMapping(value = "/users/updateProfileImage/{username}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Boolean> updateProfileImage(@PathVariable("username") String idUser,
			@RequestBody String request) {
		userService.updateProfileImage(request, idUser);
		return ResponseEntity.status(HttpStatus.OK).body(true);
	}

}

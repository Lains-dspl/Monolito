package com.monolito.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.monolito.enums.ErrorCodeEnum;
import com.monolito.models.ContentInformation;
import com.monolito.models.MessageInformation;
import com.monolito.services.ContentInformationServices;

@RestController
@CrossOrigin(origins = "*")
public class ContentManagementController {

	@Autowired
	private ContentInformationServices contentInformationServices;

	@Autowired
	private Environment env;

	@RequestMapping(value = "/uploadContent", method = RequestMethod.POST)
	public ResponseEntity<MessageInformation> createContent(@RequestBody ContentInformation request) {
		String uploadContent = env.getProperty("UploadContent");
		if (uploadContent.equals("true")) {
			MessageInformation message = contentInformationServices.createContent(request);
			return ResponseEntity.status(HttpStatus.OK).body(message);
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(new MessageInformation(ErrorCodeEnum.UPLOAD_CONTENT_DISABLED));
	}

	@RequestMapping(value = "/editContent", method = RequestMethod.POST)
	public ResponseEntity<MessageInformation> editContent(@RequestBody ContentInformation request) {
		MessageInformation message = contentInformationServices.editContent(request);
		return ResponseEntity.status(HttpStatus.OK).body(message);
	}

	@RequestMapping(value = "/deleteContent", method = RequestMethod.POST)
	public ResponseEntity<MessageInformation> deleteContent(@RequestBody String id) {
		MessageInformation message = contentInformationServices.deleteContent(id);
		return ResponseEntity.status(HttpStatus.OK).body(message);
	}

	@RequestMapping(value = "/getContents", method = RequestMethod.GET)
	public ResponseEntity<Object> findAllContents() {
		String viewContent = env.getProperty("ViewContent");
		if (viewContent.equals("true")) {
			return ResponseEntity.status(HttpStatus.OK).body(contentInformationServices.getContent());
		}

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(new MessageInformation(ErrorCodeEnum.VIEW_CONTENT_DISABLED));

	}

	@RequestMapping(value = "/getContentById/{id}", method = RequestMethod.GET)
	public ResponseEntity<ContentInformation> findContentById(@PathVariable String id) {
		return ResponseEntity.status(HttpStatus.OK).body(contentInformationServices.getContentById(id));
	}

}

package com.monolito.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monolito.models.ContentInformation;
import com.monolito.models.MessageInformation;
import com.monolito.repositories.ContentInformationRepository;

@Service
public class ContentInformationServices {

	@Autowired
	private ContentInformationRepository contentInformationRepository;

	public void createContent(ContentInformation contentInformation) {
		contentInformationRepository.save(contentInformation);
	}

	public MessageInformation editContent(ContentInformation contentInformation) {
		Optional<ContentInformation> contentAux = contentInformationRepository.findById(contentInformation.get_id());

		if (contentAux.isPresent()) {
			contentAux.get().setAuthor(contentInformation.getAuthor());
			contentAux.get().setDescription(contentInformation.getDescription());
			contentAux.get().setDocument(contentInformation.getDocument());
			contentAux.get().setTitle(contentInformation.getTitle());
			contentAux.get().setType(contentInformation.getType());
			contentAux.get().setUrl(contentInformation.getUrl());
			contentInformationRepository.save(contentAux.get());
		}
		return null;
	}

	public MessageInformation deleteContent(String id) {
		contentInformationRepository.deleteById(id);
		return null;
	}

	public List<ContentInformation> getContent() {
		return contentInformationRepository.findAll();
	}

	public ContentInformation getContentById(String id) {
		Optional<ContentInformation> content = contentInformationRepository.findById(id);
		return content.isPresent() ? content.get() : null;
	}

}

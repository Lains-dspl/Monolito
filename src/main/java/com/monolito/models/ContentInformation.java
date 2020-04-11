package com.monolito.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ContentInformation")
public class ContentInformation {

	@Id
	private String _id;
	private String author;
	private String authorUpload;
	private String title;
	private String description;
	private Date date;
	private String url;
	private String document;
	private String type;

	/**
	 * 
	 */
	public ContentInformation() {
		super();
	}

	public ContentInformation(String _id, String author, String authorUpload, String title, String description,
			Date date, String url, String document, String type) {
		super();
		this._id = _id;
		this.author = author;
		this.title = title;
		this.description = description;
		this.date = date;
		this.authorUpload = authorUpload;
		this.url = url;
		this.document = document;
		this.type = type;
	}

	public String getAuthorUpload() {
		return authorUpload;
	}

	public void setAuthorUpload(String authorUpload) {
		this.authorUpload = authorUpload;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

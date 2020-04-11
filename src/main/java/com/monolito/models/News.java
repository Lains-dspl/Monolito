package com.monolito.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "News")
public class News {

	@Id
	private String _id;
	private String author;
	private String title;
	private String description;
	private String content;
	private Date date;
	private String topic;
	private String image;

	/**
	 * 
	 */
	public News() {
		super();
	}

	/**
	 * @param author
	 * @param title
	 * @param description
	 * @param content
	 * @param topic
	 */
	public News(String author, String title, String description, String content, String topic, Date date,
			String image) {
		super();
		this.author = author;
		this.title = title;
		this.description = description;
		this.content = content;
		this.topic = topic;
		this.date = date;
		this.image = image;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}

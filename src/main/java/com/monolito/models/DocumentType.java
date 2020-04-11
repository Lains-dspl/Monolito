package com.monolito.models;

public class DocumentType {

	private int id;
	private String abbreviation;
	private String documentTypeName;

	public DocumentType() {
		super();
	}

	/**
	 * @param id
	 * @param abbreviation
	 * @param documentTypeName
	 */
	public DocumentType(int id, String abbreviation, String documentTypeName) {
		super();
		this.id = id;
		this.abbreviation = abbreviation;
		this.documentTypeName = documentTypeName;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the abbreviation
	 */
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
	 * @param abbreviation the abbreviation to set
	 */
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	/**
	 * @return the documentTypeName
	 */
	public String getDocumentTypeName() {
		return documentTypeName;
	}

	/**
	 * @param documentTypeName the documentTypeName to set
	 */
	public void setDocumentTypeName(String documentTypeName) {
		this.documentTypeName = documentTypeName;
	}

}

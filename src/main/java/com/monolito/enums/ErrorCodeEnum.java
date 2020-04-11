package com.monolito.enums;

public enum ErrorCodeEnum {
	EXISTING_USER("001"), 
	NOT_MATCH_PASSWORD("002"),
	NOT_EXISTING_USER("003"), 
	INCORRECT_PASSWORD("004"),
	NO_CAPACITY_EVENT("005"),
	DUPLICATE_PARTICIPATION_EVENT("006"),
	VIEW_CONTENT_DISABLED("007"),
	UPLOAD_CONTENT_DISABLED("008"),
	CREATE_EVENTS_DISABLED("009"),
	ATTEND_EVENTS_DISABLED("010"),
	ERROR_CREATE_EVENT("011");

	private String value;

	private ErrorCodeEnum(String i) {
		this.value = i;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
}

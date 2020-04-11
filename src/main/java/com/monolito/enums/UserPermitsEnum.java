package com.monolito.enums;

public enum UserPermitsEnum {
	CREATE_EVENTS("CREATE_EVENTS"),
	ATTEND_EVENTS("ATTEND_EVENTS"),
	CONSULT_EVENTS("CONSULT_EVENTS"),
	CONTENT_UPLOAD("CONTENT_UPLOAD"),
	CONTENT_VIEW("CONTENT_VIEW"),
	CONTENT_DOWNLOAD("CONTENT_DOWNLOAD"),
	PROFILE("PROFILE"),
	NOTIFICATIONS("NOTIFICATIONS"),
	CREATE_MILK_REQUEST("CREATE_MILK_REQUEST"),
	ASOCIATE_MILK_REQUEST("ASOCIATE_MILK_REQUEST"),
	TRACKING("TRACKING"),
	NEWS_UPLOAD("NEWS_UPLOAD"), 
	NEWS_DOWNLOAD("NEWS_DOWNLOAD"); 

	private String value;

	private UserPermitsEnum(String i) {
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

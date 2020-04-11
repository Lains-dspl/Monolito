package com.monolito.models;

import com.monolito.enums.ErrorCodeEnum;

public class MessageInformation {
	private String errorCode;

	/**
	 * @param errorCode
	 */
	public MessageInformation(ErrorCodeEnum errorCode) {
		super();
		this.errorCode = errorCode.getValue();
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
}

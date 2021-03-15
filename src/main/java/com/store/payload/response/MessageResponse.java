package com.store.payload.response;

import java.io.Serializable;

public class MessageResponse implements Serializable {
	private static final long serialVersionUID = -7884935228118710010L;
	
	private String message;
	
	public MessageResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}

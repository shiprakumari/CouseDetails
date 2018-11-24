package com.cg.session.exception;

public class BookingException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public String msg;
	public BookingException(String msg) {
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}
}

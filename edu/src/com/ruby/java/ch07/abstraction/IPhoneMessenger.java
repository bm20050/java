package com.ruby.java.ch07.abstraction;

public class IPhoneMessenger implements Messenger {

	public String getMessage() {
		return "iPhone";
	}
	
	public void setMessage(String msg) {
		System.out.println("msg: " + msg);
	}
	
	public void clearMessage() {
		System.out.println("지움");
	}
}

package com.rest.es.restfulservices.controller;

public class Message {

	private String msg;

	public Message(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Message [msg=" + msg + "]";
	}

}

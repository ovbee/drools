package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class RuleResponse {
	private int status;
	private List<ErrorMessage> errors;
	public RuleResponse() {
		status = 1;
		errors = new ArrayList<ErrorMessage>();
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public List<ErrorMessage> getErrors() {
		return errors;
	}
	public void setErrors(List<ErrorMessage> errors) {
		this.errors = errors;
	}
	public void addError(ErrorMessage errorMessage) {
		this.errors.add(errorMessage);
	}
	public void reportError(String detail, String field) {
		ErrorMessage errorMessage = new ErrorMessage();
		setStatus(0);
		errorMessage.setType("error");
		errorMessage.setDetail(detail);
		errorMessage.addField(field);
		addError(errorMessage);
	}
}

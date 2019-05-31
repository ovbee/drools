package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

public class ErrorMessage {
	private int status;
	private String type;
	private String title;
	private String detail;
	private Set<String> fields;
	public ErrorMessage() {
		fields = new HashSet<String>();
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Set<String> getFields() {
		return fields;
	}
	public void setFields(Set<String> fields) {
		this.fields = fields;
	}
	public void addField(String field) {
		this.fields.add(field);
	}
}

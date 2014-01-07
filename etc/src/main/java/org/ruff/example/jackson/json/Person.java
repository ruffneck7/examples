package org.ruff.example.jackson.json;

import java.util.List;

public class Person {
	private String name;
	private String phoneNum;
	private List<Person> family;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public List<Person> getFamily() {
		return family;
	}
	public void setFamily(List<Person> family) {
		this.family = family;
	}
}

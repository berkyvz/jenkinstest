package com.eteration.simpleapp.model;


public class Person {
	
	private String name;

	private String surname;

	private String gender;

	private String region;
	
	

	public Person(String name, String surname, String gender, String region) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.region = region;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public String getSurname() {
	return surname;
	}

	public void setSurname(String surname) {
	this.surname = surname;
	}

	public String getGender() {
	return gender;
	}

	public void setGender(String gender) {
	this.gender = gender;
	}

	public String getRegion() {
	return region;
	}

	public void setRegion(String region) {
	this.region = region;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", gender=" + gender + ", region=" + region + "]";
	}
	
	
}

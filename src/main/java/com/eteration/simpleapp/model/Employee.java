package com.eteration.simpleapp.model;

public class Employee extends Person {

	private long id;
	private double salary;


	public Employee(long id, String name, String surname, String gender, String region, double salary) {
		super(name, surname, gender, region);
		this.id = id;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	

}

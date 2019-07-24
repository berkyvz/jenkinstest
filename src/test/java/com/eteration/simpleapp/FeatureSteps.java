package com.eteration.simpleapp;


import static org.junit.Assert.assertEquals;

import com.eteration.simpleapp.controller.EmployeeController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FeatureSteps {
	
    private EmployeeController employeeController;
	
	private String employeeID;
	private String actualID;
	
	@Given("employee is exist")
	public void employee_is_exist() {
	   this.employeeID = "0";
	}

	@When("is there any employee")
	public void is_there_any_employee() throws Exception {
		employeeController = new EmployeeController();
		String e = employeeController.getZero();
		this.actualID = e;
	}

	@Then("I should be told {string}")
	public void i_should_be_told(String string) {
	    assertEquals(string, this.actualID);
	}



}

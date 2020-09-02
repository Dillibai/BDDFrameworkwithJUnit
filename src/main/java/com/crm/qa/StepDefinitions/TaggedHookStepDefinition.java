package com.crm.qa.StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHookStepDefinition {

	//Global hooks
	@Before(order=0)
	public void setUp() {
		System.out.println("Launchchrome");
		System.out.println("Enter url");
	}
	
	@After(order=0)
	public void teatDown() {
		System.out.println("close the browser");
	}
	
	@Before(order=1)
	public void setUp1() {
		System.out.println("Launchchrome");
		System.out.println("Enter url");
	}

	@After(order=1)
	public void teatDown1() {
		System.out.println("close the browser");
	}
	
	//local hooks
	@Before("@First")
	public void beforeFirst() {
		System.out.println("before only first scenario");
	}
	
	@After("@First")
	public void afterFirst() {
		System.out.println("before only first scenario");
	}
	
	@Before("@Second")
	public void beforeSecond() {
		System.out.println("before only Second scenario");
	}
	
	@After("@Second")
	public void afterSecond() {
		System.out.println("after only Second scenario");
	}
	
	@Before("@Third")
	public void beforeThird() {
		System.out.println("before only third scenario");
	}
	
	@After("@Third")
	public void afterThird() {
		System.out.println("after only third scenario");
	}

	@Given("^this is the first step$")
	public void this_is_the_first_step() throws Throwable {
		System.out.println("this is the first step");
	}

	@When("^this is the second step$")
	public void this_is_the_second_step() throws Throwable {
		System.out.println("second step");
	}
	
	@Then("^this is the third step$")
	public void this_is_the_third_step() throws Throwable {  
		System.out.println("third step");
	}
	
}

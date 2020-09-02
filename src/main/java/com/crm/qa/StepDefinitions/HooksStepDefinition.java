//package com.crm.qa.StepDefinitions;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class HooksStepDefinition {
//	
//	@Before
//	public void setUp() {
//		System.out.println("Launchchrome");
//		System.out.println("Enter url");
//	}
//	
//	@After
//	public void teatDown() {
//		System.out.println("close the browser");
//	}
//	
//	@Given("^User is already on Login Page$")
//	public void user_is_already_on_Login_Page() throws Throwable {
//	    System.out.println("user is already on Login page");
//	}
//
//	@When("^Title of Login Page is Free CRM$")
//	public void title_of_Login_Page_is_Free_CRM() throws Throwable {
//		System.out.println("title of login page");
//	}
//
//	@Then("^User enters username and password$")
//	public void user_enters_username_and_password() throws Throwable {
//	    System.out.println("user enters username");
//	}
//	
//	@Given("^this is a contact test case$")
//	public void this_is_a_contact_test_case() throws Throwable {
//	    System.out.println("contact tc");
//	}
//	
//	@When("^user fills the contact form$")
//	public void user_fills_the_contact_form() {
//		System.out.println("contact form");
//	}
//	
//	@Given("^user is on email page$")
//	public void user_is_on_email_page() throws Throwable {
//	    System.out.println("email page");
//	}
//
//	@When("^user fills email form$")
//	public void user_fills_email_form() throws Throwable {
//	   System.out.println("email form");
//	}
//	
//}

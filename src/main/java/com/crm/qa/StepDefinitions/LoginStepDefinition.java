//package com.crm.qa.StepDefinitions;
//
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import com.crm.qa.BaseClass.TestBase;
//import com.crm.qa.BaseClass.UtilityMethods;
//import com.crm.qa.PagesClass.HomePage;
//import com.crm.qa.PagesClass.LoginPage;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginStepDefinition extends TestBase {
//
//	
//	LoginPage login;
//	UtilityMethods util;
//	HomePage home;
//
//	@Given("^User is already on Login Page$")
//	public void user_is_already_on_Login_Page() throws Throwable {
//
//		init();
//	}
//
//	@When("^Title of Login Page is Free CRM$")
//	public void Title_of_login_page_is_free_crm() {
//
//		login = new LoginPage();
//		String title = login.ValidateTitle();
//		System.out.println(title);
//		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
//	}
//	//\*(.*)\* and \*(.*)\*
//	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_username_and_password(String username, String password) {
//		login.Login(username, password);
//	}
//
//	@Then("^User clicks on login button$")
//	public void user_clicks_on_login_button() throws Throwable {
//
//		login.LoginSubmit().click();
////		JavascriptExecutor js = (JavascriptExecutor)driver;
////		js.executeScript("arguments[0].click();", login.LoginSubmit());
//	}
//
//	@Then("^User is on Home Page$")
//	public void user_is_on_Home_Page() {
//
//		String title = login.ValidateTitle();
//		Assert.assertEquals("CRMPRO", title);
//	}
//	
//	@Then("^User moves to new contact page$")		
//	
//	public void user_moves_to_new_contact_page(){		
//		
//		driver.switchTo().frame("mainpanel");
//		util = new UtilityMethods();
//		home = new HomePage();
//		login.moveToElement(home.Contacts());
//		home.NewContact().click();		
//	}
//	
//	@Then("^User enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_contacts_details(String firstname, String lastname, String position) {
//		
//		home.firstname().sendKeys(firstname);
//		home.lastname().sendKeys(lastname);
//		home.position().sendKeys(position);
//		home.Save().click();
//	}
//	
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		
//		login.close();
//	}
//}

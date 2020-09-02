//package com.crm.qa.StepDefinitions;
//
//import java.util.List;
//import java.util.Map;
//
//import org.junit.Assert;
//import com.crm.qa.BaseClass.TestBase;
//import com.crm.qa.BaseClass.UtilityMethods;
//import com.crm.qa.PagesClass.HomePage;
//import com.crm.qa.PagesClass.LoginPage;
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealStepDefinitionwithMap extends TestBase {
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
//
//	// \*(.*)\* and \*(.*)\*
//	@Then("^User enters username and password$")
//	public void user_enters_username_and_password(DataTable dealData) {
//		for(Map<String, String> data:dealData.asMaps(String.class, String.class)) {
//		login.Login(data.get("username"), data.get("password"));
//		}
//	}
//
//	@Then("^User clicks on login button$")
//	public void user_clicks_on_login_button() throws Throwable {
//
//		login.LoginSubmit().click();
////			JavascriptExecutor js = (JavascriptExecutor)driver;
////			js.executeScript("arguments[0].click();", login.LoginSubmit());
//	}
//
//	@Then("^User is on Home Page$")
//	public void user_is_on_Home_Page() {
//
//		String title = login.ValidateTitle();
//		Assert.assertEquals("CRMPRO", title);
//	}
//
//	@Then("^User moves to new deal page$")
//	public void user_moves_to_new_deal_page() {
//
//		driver.switchTo().frame("mainpanel");
//		util = new UtilityMethods();
//		home = new HomePage();
//		util.moveToElement(home.Deals());
//		home.NewDeal().click();
//	}
//
//	@Then("^User enters deal details$")
//	public void user_enters_deal_details(DataTable dealData) {
//
//		for(Map<String, String> data:dealData.asMaps(String.class, String.class)) {
//			
//		home.DealTitle().sendKeys(data.get("title"));
//		home.DealAmount().sendKeys(data.get("amount"));
//		home.DealProb().sendKeys(data.get("probability"));
//		home.Dealcommission().sendKeys(data.get("commission"));
//		home.Save().click();
//		
//		util.moveToElement(home.Deals());
//		home.NewDeal().click();		
//		}
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//
//		login.close();
//	}
//}

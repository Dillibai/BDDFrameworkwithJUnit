package com.crm.qa.PagesClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.BaseClass.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name = "username")
	WebElement Username;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(xpath = "//input[@class='btn btn-small' and @value='Login']")
	WebElement LoginSubmit;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement LoginSubmit() {
		return LoginSubmit;
	}

	public void close() {
		driver.quit();
	}

	public String ValidateTitle() {
		return driver.getTitle();
	}

	public void Login(String username, String password) {
		Username.sendKeys(username);
		Password.sendKeys(password);
	}	
}

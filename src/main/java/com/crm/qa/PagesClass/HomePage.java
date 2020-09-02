package com.crm.qa.PagesClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.BaseClass.TestBase;

public class HomePage extends TestBase {	
	
	@FindBy(xpath="//a[text()='New Contact']")
	WebElement NewContact;
	
	@FindBy(xpath="//a[text()='Contacts']")
	WebElement Contacts;
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id="surname")
	WebElement lastname;
	
	@FindBy(id="company_position")
	WebElement position;
	
	@FindBy(xpath="(//input[@type='submit' and @value='Save'])[1]")
	WebElement Save;
	
	@FindBy(xpath="//a[text()='Deals']")
	WebElement Deals;
	
	@FindBy(xpath="//a[text()='New Deal']")
	WebElement NewDeal;	
	
	@FindBy(id="title")
	WebElement DealTitle;	
	
	@FindBy(id="amount")
	WebElement DealAmount;	
	
	@FindBy(id="probability")
	WebElement DealProb;
	
	@FindBy(id="commission")
	WebElement Dealcommission;	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Dealcommission() {
		return Dealcommission;
	}
	
	public WebElement DealProb() {
		return DealProb;
	}
	
	public WebElement DealAmount() {
		return DealAmount;
	}
	
	public WebElement DealTitle() {
		return DealTitle;
	}
	
	public WebElement NewDeal() {
		return NewDeal;
	}
	
	public WebElement Save() {
		return Save;
	}
	
	public WebElement position() {
		return position;
	}
	
	public WebElement lastname() {
		return lastname;
	}
	
	public WebElement firstname() {
		return firstname;
	}
	
	public WebElement NewContact() {
		return NewContact;
	}
	
	public WebElement Contacts() {
		return Contacts;
	}	
	
	public WebElement Deals() {
		return Deals;
	}

}

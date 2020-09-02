package com.crm.qa.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class UtilityMethods extends TestBase{
	
	public static WebDriver driver;
	
	public UtilityMethods()
	{
		PageFactory.initElements(driver, this);
	}	
	
	public void  moveToElement(WebElement element) {
		
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

}

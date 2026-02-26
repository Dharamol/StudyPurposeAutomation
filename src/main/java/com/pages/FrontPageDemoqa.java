package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.BasePage;

public class FrontPageDemoqa extends BasePage{
	
	private By elements =By.xpath("//div[contains(@class,'card mt-4 top-card')]");
	
	public FrontPageDemoqa(WebDriver driver)
	{
		super(driver);
	}
	
	public void clickOnElements()
	{
		driver.findElement(elements).click();
	}

}

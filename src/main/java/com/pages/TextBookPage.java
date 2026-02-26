package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BasePage;

public class TextBookPage extends BasePage {
	
	private By fullName= By.id("userName");
	private By email =By.id("userEmail");
	private By currentAddress  =By.id("currentAddress");
	private By permanentAddress = By.id("permanentAddress");
	private By submitButton =By.xpath("//button[contains(@class,'btn btn-primary')]");
	private By getValue =By.xpath("//div[contains(@class,'border col-md-12 col-sm-12')]");
	
	public TextBookPage(WebDriver driver)
	{
		super(driver);
	}
	public void submitTheForm(String name,String emailId,String currAddress,String PerAddress) {
		waitForVisibility(driver.findElement(fullName)).sendKeys(name);
		waitForVisibility(driver.findElement(email)).sendKeys(emailId);
		waitForVisibility(driver.findElement(currentAddress)).sendKeys(currAddress);
		waitForVisibility(driver.findElement(permanentAddress)).sendKeys(PerAddress);
		//waitForVisibility(driver.findElement(submit)).click();

	}
	public void submitClick()
	{
		scrollToElement(driver.findElement(submitButton)).click();;
		//clickWhenReady(driver.findElement(submitButton)).click();
	
	}
	public String getText()
	{
		return driver.findElement(getValue).getText();
	}
	
}

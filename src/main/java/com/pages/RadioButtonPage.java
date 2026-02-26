package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BasePage;


public class RadioButtonPage extends BasePage{
	
	private By yes=By.id("yesRadio");
	private By impressive = By.id("impressiveRadio");
	private By result =By.xpath("//p[contains(@class,'mt-3')]");
	private By no =By.id("noRadio");
	
	public RadioButtonPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickYes()
	{
		clickWhenReady(driver.findElement(yes)).click();
	}
	public String resultGetText()
	{
		return driver.findElement(result).getText();
	}
	public boolean noRadioButton()
	{
	return driver.findElement(no).isEnabled();
	}
	public void enableNoRadio()
	{
		enableField(driver.findElement(no));
	}
	public void clickOnNo()
	{
		clickonEnabledField(driver.findElement(no));
	}
	
	
	

}

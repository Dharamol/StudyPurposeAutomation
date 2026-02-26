package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.BasePage;

public class ElementsPage extends BasePage{
	
	public ElementsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By textBox=By.xpath("//span[text()='Text Box']");
	private By checkBox=By.xpath("//span[text()='Check Box']");
	private By radioButton=By.xpath("//span[contains(text(),'Radio Button')]");
	
	public void textBoxClick()
	{
		clickWhenReady(driver.findElement(textBox)).click();
		//driver.findElement(textBox).click();
	}
	public void checkBoxClick()
	{
		clickWhenReady(driver.findElement(checkBox)).click();
	}
	public void radioButtonClick()
	{
		clickWhenReady(driver.findElement(radioButton)).click();
	}

}

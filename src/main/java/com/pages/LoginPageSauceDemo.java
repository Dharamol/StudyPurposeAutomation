package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.BasePage;


public class LoginPageSauceDemo extends BasePage{
	 
	private By usernamField =By.id("user-name");
	private By passwordField =By.id("password");
	private By loginButton = By.id("login-button");
	
	public  LoginPageSauceDemo(WebDriver driver)
	{
		
		super(driver);
	}
	//Action
	public void login(String username, String password)
	{
		waitForVisibility(driver.findElement(usernamField)).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		clickWhenReady(driver.findElement(loginButton)).click();
				}
	

}

package com.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage{
	
	 protected WebDriver driver;
	protected WebDriverWait wait;
	 JavascriptExecutor js;
	
	public BasePage(WebDriver driver)
	{
	this.driver=driver;	
	this.wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	this.js=(JavascriptExecutor) driver;
	}
	
	
	public WebElement clickWhenReady(WebElement element)
	{
		
		return wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	public WebElement waitForVisibility(WebElement element)
	{
		
		return wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public WebElement waitForPresence(By locator)
	{
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	public WebElement scrollToElement(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		return element;
	}
	public WebElement enableField(WebElement element)
	{
		js.executeScript("arguments[0].removeAttribute('disables');",element);
		return element;
	}
	public void clickonEnabledField(WebElement element) {
		js.executeScript("arguments[0].click();", element);
	}
	
	
	

}

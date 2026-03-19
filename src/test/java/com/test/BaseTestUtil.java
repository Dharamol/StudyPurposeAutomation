package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeOptions;

import com.utils.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestUtil {
	
	 protected WebDriver driver;
	 
	 String url =ConfigReader.get("saucedemo.url");
	 
	@BeforeMethod
	public void driverManager()
	{
	
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(url);
//		
		
		WebDriverManager.chromedriver().setup();

	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--headless");        // IMPORTANT
	    options.addArguments("--no-sandbox");      // REQUIRED in Jenkins
	    options.addArguments("--disable-dev-shm-usage");

	    driver = new ChromeDriver(options);

	    driver.manage().window().maximize();
	    driver.get(url);
	}
	
	@AfterMethod
	public void quitBrowser()
{
		driver.quit();	}
	
	

}

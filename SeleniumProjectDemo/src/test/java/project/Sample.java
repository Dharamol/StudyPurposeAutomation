package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		
	
	 WebDriver driver;
	 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/login/");
	 driver.findElement(By.id("email")).sendKeys("dhara");
	 
	 
	} 

}

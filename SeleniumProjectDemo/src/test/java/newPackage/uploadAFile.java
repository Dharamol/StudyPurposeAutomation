package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadAFile {
	public static void main(String[] args)
	{
	WebDriver driver;
	driver = new ChromeDriver();
	 driver.get("https://testautomationpractice.blogspot.com");
	 WebElement element = driver.findElement(By.xpath("//input[contains(@id,'singleFileInput')]"));
	 JavascriptExecutor js =(JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView(true);",element);
	 element.sendKeys("C:\\Users\\SANDHARA\\Documents\\DHARA_Resume.pdf");
	 
}
}

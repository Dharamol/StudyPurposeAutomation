package project;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample3 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.className("Pke_EE")).sendKeys("Fan");
	File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String name = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	FileHandler.copy(screenshot, new File(System.getProperty("user.dir")+"\\src\\main\\resources\\screenshot\\"+name+".png"));
	
	
	
	
}
}

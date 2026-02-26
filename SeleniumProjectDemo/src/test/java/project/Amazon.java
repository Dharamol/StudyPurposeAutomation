package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@class='nav-a  '][1]")).click();
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver ;
		 javascriptExecutor.executeScript("window.scrollBy(100, 0)");
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 Alert alert = driver.switchTo().alert();
		 alert.dismiss();		 
		
	}

}

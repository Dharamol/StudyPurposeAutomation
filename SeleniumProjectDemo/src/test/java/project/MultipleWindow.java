package project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
	public static void main(String[] args) {
		
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe" );
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/index.php");
		WebElement web = driver.findElement(By.id("alert-modal"));
		web.click();
		driver.findElement(By.xpath("//a[text()='Window Popup']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/obsqurazone/']")).click();
		String mainWindow = driver.getWindowHandle();
		Set<String> multipleWindow= driver.getWindowHandles();
		for(String currentWindow:multipleWindow)
		{
			if(!currentWindow.equals(mainWindow))
			{
				driver.switchTo().window(currentWindow);
			}
		}
		driver.manage().window().maximize();
		
//		href="https://www.facebook.com/obsqurazone/"
//		href='https://www.facebook.com/obsqurazone/
//			
		
		
	}

}

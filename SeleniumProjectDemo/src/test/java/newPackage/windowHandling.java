package newPackage;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowHandling {
	public static void main(String[] args)
	{
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.findElement(By.xpath("//a[contains(@id,'alert-modal')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Window Popup')]")).click();
		
		String windowHandle = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[contains(text(),'  Like us On Facebook ')]")).click();
		Set<String> windowHandles =driver.getWindowHandles();
		for (String window:windowHandles)
		{
			if(!window.equals(windowHandle))
			{
				driver.switchTo().window(window);
			}
		}
		WebElement element =driver.findElement(By.xpath("//span[contains(@id,'_r_4_')]"));
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		
		element.sendKeys("dhara");
	}
	

}

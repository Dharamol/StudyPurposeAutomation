package project;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.reactivex.rxjava3.functions.Action;

public class TestSample {
	public static void main(String[] args) {
		
		WebDriver driver;
		// System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		driver = new EdgeDriver();
		 
		driver.get("https://www.bookswagon.com/");
		driver.manage().window().maximize();
		// driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement element =driver.findElement(By.xpath("//li[@class='dropdown list-inline-item']"));
	
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		WebElement element1 =	 driver.findElement(By.xpath("//a[@href='https://www.bookswagon.com/fiction-books']"));
		 WebElement historical=	driver.findElement(By.xpath("//div[@class='desktopmenupopup']/descendant::a[text()='Historical fiction']"));

		Actions action = new Actions(driver);
		action.moveToElement(element1).moveToElement(historical).perform();
		historical.click();
		WebElement sortBy =driver.findElement(By.xpath("//select[@id='ddlSort']"));
		Select select = new Select(sortBy);
		select.selectByVisibleText("Title - A to Z");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement bookName =driver.findElement(By.xpath("//div[@class='title']//a[@href='https://www.bookswagon.com/book/1916-vincent-d-corrigan/9780595273690']"));
		String value =bookName.getText();
		System.out.println(value);
		Assert.assertEquals(value, "1916");
		
		
		
		
		 //action.moveToElement(historical).click();
		
//href="https://www.bookswagon.com/historical-fiction-books"
//		 element1.click();
//	WebElement element3 = driver.findElement(By.id("330"));
//	 wait.until(ExpectedConditions.elementToBeClickable(element3));
//	 element3.click();
//	 driver.findElement(By.xpath("//select[@id='ddlSort']")).click();
//	 Select select = new Select((WebElement) driver);
//	 select.selectByValue("Title - Z to A");

	 
		 
	


}
}

package tests;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Assert;


public class AlertsAndModels {
	
		WebDriver driver;
	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void  scroll() throws InterruptedException
	{
		
		String value ="dhara@gmail.com";
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		 driver  =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://selenium.qabible.in/javascript-alert.php");
		 driver.findElement(By.xpath("//a[text()='Javascript Alert']")).click();
		 driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		 Alert alert = driver.switchTo().alert();
		String alertMessage= alert.getText();
		String value1 ="I am a Javascript alert box!";
		System.out.println(alertMessage);
		Assert.assertEquals(alertMessage,value1);
		
		alert.accept();
	
	}
	@Test
	public static void Sample()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
	}
	@SuppressWarnings("deprecation")
	@Test
	public static void scrollVertically() throws InterruptedException
	{
		
		System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5km84u9k2k_e&adgrpid=155259813113&hvpone=&hvptwo=&hvadid=793178077432&hvpos=&hvnetw=g&hvrand=3120890693415281440&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9185435&hvtargid=kwd-304880464215&hydadcr=14450_2438227&gad_source=1");
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
		
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Instagram')]")));
		//element.click();
		//js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	@Test
	public static void scrollToBottom() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		driver.get("https://www.amazon.in/");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Instagram')]")));
		element.click();
		//js.executeScript("window.scrollTo(0,0);");
		//Thread.sleep(2000);
	}
	
	@Test
	public static void AlertHandling()
	{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\"\\src\\main\\resources\\chromedriver.exe");
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(), 'Alerts and Modals')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Javascript Alert')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Click me!')]")).click();
		Alert alert  =driver.switchTo().alert();
		String s= alert.getText();
		alert.accept();
		System.out.println(s);
		
		
		
		
	}
	@Test
	public static void windowHandling() throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.findElement(By.xpath("//a[contains(@id,'alert-modal')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Window Popup')]")).click();
		
		String windowHandle = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[contains(text(),'  Like us On Facebook ')]")).click();
		Set<String> windowHandles =driver.getWindowHandles();
		for (String wind:windowHandles)
		{
			if(!windowHandle.equals(wind))
			{
				driver.switchTo().window(wind);
			}
		}
		Thread.sleep(1000);
		WebElement element =driver.findElement(By.xpath("//span[contains(text(),'ഇമെയിൽ അല്ലെങ്കിൽ ഫോൺ നമ്പർ')]"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		
		element.sendKeys("dhara");
	}
	
	
}

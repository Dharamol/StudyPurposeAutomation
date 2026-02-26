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

public class Sample_2 {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver","E:\\Java_Selenium\\SeleniumProjectDemo\\src\\main\\resources\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources//chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_b&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw=g&hvrand=10137928931228122504&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9149588&hvtargid=kwd-311187680635&hydadcr=5841_2362028");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("charger");;
		File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String fileName =new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		FileHandler.copy(screenshot,new File(System.getProperty("user.dir")+"\\src\\main\\resources\\Screenshots\\"+fileName+".png"));
		
	}
	
	

}

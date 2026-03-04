package com.test;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.ElementsPage;
import com.pages.FrontPageDemoqa;
import com.pages.LoginPageSauceDemo;
import com.pages.RadioButtonPage;
import com.pages.TextBookPage;
import com.pages.checkBoxPage;

public class VerifyingTheBaseTest extends BaseTestUtil{
	
	
	/*
	 * @Test public void test1() throws InterruptedException {
	 * System.out.println("dhara"); //driver.get("www.amazon.in");
	 * Thread.sleep(1000); //quitBrowser();
	 * 
	 * }
	 */

	/*
	 * @Test public void sauceLogin() { //LoginPageSauceDemo logo = new
	 * LoginPageSauceDemo(driver); //logo.login("dhara","sandy");
	 * 
	 * }
	 */
	@Test
	public void element_TextBox1() throws InterruptedException
	{
		FrontPageDemoqa val= new FrontPageDemoqa(driver);	
			val.clickOnElements();
			Thread.sleep(2000);
			ElementsPage element = new ElementsPage(driver);
			element.textBoxClick();
			Thread.sleep(2000);
			TextBookPage page = new TextBookPage(driver);
			page.submitTheForm("dhara","dhara@gmail.com","Melehouse pazhayannur thrissur kerala","Melehouse pazhayannur thrissur kerala");
			Thread.sleep(5000);
			page.submitClick();
			String a1=page.getText();
			String[] lines =a1.split("\\n");
		String actualName=lines[0].split(":")[1].trim();
		String actaulEmail=lines[1].split(":")[1].trim();
		String actualCurrentAddress =lines[2].split(":")[1].trim();
		String actualPermanentAddress = lines[3].split(":")[1].trim();
		
		Assert.assertEquals(actualName, "dhara");
		Assert.assertEquals(actaulEmail, "dhara@gmail.com");
		Assert.assertEquals(actualCurrentAddress, "Melehouse pazhayannur thrissur kerala");
		Assert.assertEquals(actualPermanentAddress, "Melehouse pazhayannur thrissur kerala");
		
	}
	@Test
	public void checkBoxVerifying() throws InterruptedException
	{
		FrontPageDemoqa val= new FrontPageDemoqa(driver);	
		val.clickOnElements();
		Thread.sleep(2000);
		ElementsPage element = new ElementsPage(driver);
		element.checkBoxClick();
		Thread.sleep(2000);
		checkBoxPage page =new checkBoxPage(driver);
		page.homeExpandClick();
		page.homeCheckBoxClick();
		String a1=page.resultText();
		String result=a1.replaceAll("\\r?\\n"," ").split(":")[1].trim();
		System.out.println(result);
		page.desktopExpandClick();
		page.documentExpandClick();
		page.downloadExpandClick();
		page.workSpaceExpandClick();
		page.officeExpand();
		Assert.assertEquals(result,"home desktop documents downloads notes commands workspace office wordFile excelFile react angular veu public private classified general");
		
		
		
	}
	@Test
	public void verifyRadioButton() throws InterruptedException
	{
		
				FrontPageDemoqa value= new FrontPageDemoqa(driver);
				value.clickOnElements();
				Thread.sleep(2000);
				ElementsPage element = new ElementsPage(driver);
				element.radioButtonClick();
				Thread.sleep(2000);
				RadioButtonPage page= new RadioButtonPage(driver);
				page.clickYes();
				String a1=page.resultGetText();
//				String result=a1.split(":")[1].trim();
//				System.out.println(result);
				Assert.assertEquals(a1, "You have selected Yes");
				Assert.assertFalse(page.noRadioButton());
			
				
	}
	@Test(dependsOnMethods="verifyRadioButton")
	public void enableNoRadioButton() throws InterruptedException
	
	{
		FrontPageDemoqa value= new FrontPageDemoqa(driver);
		value.clickOnElements();
		Thread.sleep(2000);
		ElementsPage element = new ElementsPage(driver);
		element.radioButtonClick();
		Thread.sleep(2000);
		RadioButtonPage page= new RadioButtonPage(driver);
		
		page.enableNoRadio();
		page.clickOnNo();
	}
	

	
}

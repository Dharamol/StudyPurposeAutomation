package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.BasePage;

public class checkBoxPage extends BasePage{
	
	private By homeExpand=By.xpath("//span[contains(@class,'rc-tree-switcher rc-tree-switcher_close')]");
	private By desktopExpand=By.xpath("//span[contains(@title,'Desktop')]//preceding-sibling::span[contains(@class,'rc-tree-switcher rc-tree-switcher_close')]");
	private By documentExpand =By.xpath("//span[contains(@title,'Documents')]//preceding-sibling::span[contains(@class,'rc-tree-switcher rc-tree-switcher_close')]");
	private By downloadsExpand =By.xpath("//span[contains(@title,'Downloads')]//preceding-sibling::span[contains(@class,'rc-tree-switcher rc-tree-switcher_close')]");
	
	private By workSpaceExpand =By.xpath("//span[contains(@title,'WorkSpace')]//preceding-sibling::span[contains(@class,'rc-tree-switcher rc-tree-switcher_close')]");
	private By officeExpand =By.xpath("//span[contains(@title,'Office')]//preceding-sibling::span[contains(@class,'rc-tree-switcher rc-tree-switcher_close')]");

	private By homeCheckBox =By.xpath("//span[contains(@title,'Home')]//parent::div//child::span[@class='rc-tree-checkbox']");
	
	private By result=By.xpath("//div[@id='result']");
public checkBoxPage(WebDriver driver)
{
	super(driver);
}

public void homeExpandClick()
{
	clickWhenReady(driver.findElement(homeExpand)).click();
}
public void desktopExpandClick()
{

	clickWhenReady(driver.findElement(desktopExpand)).click();

}
public void documentExpandClick()
{
	clickWhenReady(driver.findElement(documentExpand)).click();

}
public void downloadExpandClick()
{
	clickWhenReady(driver.findElement(downloadsExpand)).click();
}
public void workSpaceExpandClick()
{
	clickWhenReady(driver.findElement(workSpaceExpand)).click();
}
public void officeExpand()
{
	clickWhenReady(driver.findElement(officeExpand)).click();
}
public void homeCheckBoxClick()
{
	clickWhenReady(driver.findElement(homeCheckBox)).click();
	}
public String resultText()
{
	return driver.findElement(result).getText();
}
}



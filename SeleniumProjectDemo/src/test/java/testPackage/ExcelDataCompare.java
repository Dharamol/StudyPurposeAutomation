package testPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.DriverInitializer;
import pages.HomePage;
import pages.TablePage;

public class ExcelDataCompare extends DriverInitializer{
	
	WebDriver driver;
	HomePage home;
	TablePage table;
	@Test
	public void TableDataRead() throws IOException
	{
		driver= getDriver();
		home =new HomePage(driver);
		home.clickTable();
		table.tableData();
		}
	
	

}

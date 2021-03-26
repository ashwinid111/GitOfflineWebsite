package com.jbk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.jbk.UsefulLinksPage.UsefulLinksPage;

public class UsefulLinksTest 
{
	
		WebDriver driver=null;
		UsefulLinksPage Up ;
		
		public ExtentReports extent;
		public ExtentTest test;
		@BeforeMethod
			public void commonToAll() {
				 driver = new ChromeDriver();
				driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/links.html");
				Up = new UsefulLinksPage (driver);
				System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
				}
		@AfterMethod
public void close(){
			driver.close();
		}
			

@Test(priority=1)
public void printAllData1()
{
	test = extent.createTest("pritalldata");

	System.out.println(Up.printAllData());
	
	
}
@Test(priority=2)
public void A(){
	test = extent.createTest("pritalldata");
Assert.assertEquals("headername.getText()", "Header");

}
@Test(priority=3)
public void click1() throws InterruptedException{
	test = extent.createTest("pritalldata");
	Assert.assertTrue(Up.click());

}

@Test(priority=4)
public void printContentColumn1(){
	test = extent.createTest("pritalldata");
	System.out.println(Up.printContentColumn());
	
}
@Test(priority=5)
public void clickGo1(){
test = extent.createTest("pritalldata");
	
	Assert.assertTrue(Up.clickGo());
	
	
}

}
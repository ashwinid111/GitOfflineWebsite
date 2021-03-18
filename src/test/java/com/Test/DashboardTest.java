package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.DashboardPage;

public class DashboardTest  {
	WebDriver driver;
	DashboardPage dp;
	
	@BeforeMethod
	public void setup()  {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/GAURI/Desktop/Offline%20website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		dp=new DashboardPage(driver);
		
	}
	
@Test
public void dashboardheading1() {
	Assert.assertTrue(dp.dashboardheading());
	
}

@Test
public void courses1() {
	Assert.assertTrue(dp.courses());
}
@Test
public void verifycourses1() {
	Assert.assertTrue(dp.verifycourses());
}
@Test
public void dashboardcontent1() {
    Assert.assertTrue(dp.dashboardcontent());
}

@Test
public void automationtesting1() {
	Assert.assertTrue(dp.automationtesting());
}

@Test
public void softwaredevelopment1() {
	Assert.assertTrue(dp.softwaredevelopment());
}
@Test
public void datascience1() {
	Assert.assertTrue(dp.datascience());
}

@Test
public void wevdevelopment1() {
	Assert.assertTrue(dp.webdevlopment());
}
@Test
public void JavaByKiran1() {
	Assert.assertTrue(dp.JavaByKiran());
}
}
	














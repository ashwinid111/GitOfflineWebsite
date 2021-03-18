package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.LoginRegPage;

public class LoginRegTest extends TestBase{
	com.jbk.pages.LoginRegPage loginRegPage ;

	public LoginRegTest(){
		super();
	}

	@BeforeMethod
	public void setup()
	{
		initialization();
		loginRegPage=new LoginRegPage();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

	@Test(priority=1)
	public void validateDashboardPage() throws Throwable
	{
		Assert.assertTrue(loginRegPage.verifyLogin());
	}

	@Test(priority=2)
	public void validateTitle()
	{
		Assert.assertTrue(loginRegPage.checkTitle());
	}

	@Test(priority=3)
	public void validateBlankName() throws Throwable
	{
		Assert.assertTrue(loginRegPage.checkBlankName());
	}

	@Test(priority=4)
	public void validateInstruction()
	{
		Assert.assertTrue(loginRegPage.checkInstruction());
	}

	@Test(priority=5)
	public void validateValidName() throws Throwable
	{
		Assert.assertTrue(loginRegPage.checkValidName());
	}

	@Test(priority=6)
	public void validateBlankMobileNo() throws Throwable
	{
		Assert.assertTrue(loginRegPage.checkBlankMobileNo());
	}
	
	@Test(priority=7)
	public void validateValidMobileNo() throws Throwable
	{
		Assert.assertTrue(loginRegPage.checkValidMobileNo());
	}
	
	@Test(priority=8)
	public void validateBlankEmail() throws Throwable
	{
		Assert.assertTrue(loginRegPage.checkBlankEmail());
	}
	
	@Test(priority=9)
	public void validateInvalidEmail() throws Throwable
	{
		Assert.assertTrue(loginRegPage.checkInvalidEmail());
	}
	
	@Test(priority=10)
	public void validateBlankPassword() throws Throwable
	{
		Assert.assertTrue(loginRegPage.checkBlankPassword());
	}
	
	@Test(priority=11)
	public void validatePassword() throws Throwable
	{
		Assert.assertTrue(loginRegPage.checkPassword());
	}
	
	@Test(priority=12)
	public void validateRegistration() throws Throwable
	{
		Assert.assertTrue(loginRegPage.checkRegPage1());
	}
	
	@Test(priority=13)
	public void validatePlaceholderMobile() throws Throwable
	{
		Assert.assertTrue(loginRegPage.checkPlaceholderMobile());
	}
	
	@Test(priority=14)
	public void validatePlaceholderEmail() throws Throwable
	{
		Assert.assertTrue(loginRegPage.checkPlaceholderEmail());
	}
	
	@Test(priority=15)
	public void validatePlaceholderPassword() throws Throwable
	{
		Assert.assertTrue(loginRegPage.checkPlaceholderPassword());
	}
	
	@Test(priority=16)
	public void validatePasswordErrorMsg() throws Throwable{
		Assert.assertTrue(loginRegPage.checkPasswordErrorMsg());
	}
	
	@Test(priority=17)
	public void validateEmailErrorMsg()throws Throwable{
		Assert.assertTrue(loginRegPage.checkEmailErrorMsg());
	}
}

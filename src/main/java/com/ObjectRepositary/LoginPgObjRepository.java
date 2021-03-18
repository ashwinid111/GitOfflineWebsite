package com.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.jbk.test.TestBase;


public class LoginPgObjRepository extends TestBase{
	@FindBy(id="email")
	public static WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
	
	@FindBy(partialLinkText="Register")
	public WebElement Register1;
	
	
	@FindBy(tagName="b")
	public WebElement title;
	
	@FindBy(xpath="//button")
	public WebElement signinButton;
	
	@FindBy(id="name_error")
	public WebElement blankName;
	
	@FindBy(id="name")
	public WebElement name1;
	
	@FindBy(id="mobile")
	public WebElement mobile1;
	
	@FindBy(linkText="I already have a membership")
	public WebElement instruction;
	
	@FindBy(xpath="//a[@class]")
	public WebElement reverse;
	
	
	@FindBy(id="name_error")
	public WebElement validName;
	
	@FindBy(id="mobile_error")
	public WebElement blankMobileNo;
	
	@FindBy(id="mobile_error")
	public WebElement validMobileNo;
	
	@FindBy(id="email_error")
	public WebElement email;
	
	@FindBy(id="password_error")
	public WebElement password1;
	
}

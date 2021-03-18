package com.jbk.pages;
import org.openqa.selenium.support.PageFactory;

import com.ObjectRepositary.LoginPgObjRepository;
import com.jbk.utility.Generics;

public class LoginRegPage extends LoginPgObjRepository {

	public  LoginRegPage(){

		PageFactory.initElements(driver, this);

	}

	public boolean verifyLogin(){
		Generics.sendkeys1(username, "kiran@gmail.com");
		Generics.sendkeys1(password, "123456");
		Generics.click1(signinButton);

		String actDashboard=driver.getTitle();
		String expDashboard="JavaByKiran | Dashboard";
		if(actDashboard.equals(expDashboard))
		{
			System.out.println(" Dashboard matched");
			return true;
		}
		else
		{
			System.out.println("Dashboard not matched");
			return false;
		}
	}

	public boolean checkTitle(){
		Generics.click1(Register1);
		String actualTitle=Generics.getText1(title);   
		String expectedTitle="Java By Kiran";		

		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("page title matched");
			return true;
		}
		else
		{
			System.out.println("page title not matched");
			return false;
		}}

	public boolean checkBlankName ()throws Throwable{
		Generics.click1(Register1);
		Generics.click1(signinButton);
		String actualBlankName=Generics.getText1(blankName); 
		String expectedBlankName="Please enter Name.";
		if(actualBlankName.equals(expectedBlankName))
		{
			System.out.println("page BlankName matched");
			return true;
		}
		else
		{
			System.out.println("page BlankName not matched");
			return false;
		}}

	public boolean checkInstruction(){
		Generics.click1(Register1);
		String actualInstruction=Generics.getText1(instruction); 
		String expectedInstruction="I already have a membership";

		if(actualInstruction.equals(expectedInstruction))
		{
			System.out.println("page Instruction matched");
			return true;
		}
		else
		{
			System.out.println("page Instruction not matched");
			return false;
		}}
	public boolean checkValidName ()throws Throwable{
		Generics.click1(Register1);
		Generics.sendkeys1(name1, "abcd");
		Generics.click1(signinButton);
		String actualValidName=Generics.getText1(validName); 
		String expectedValidName="";

		if(actualValidName.equals(expectedValidName))
		{
			System.out.println("page ValidName matched");
			return true;
		}
		else
		{
			System.out.println("page ValidName not matched");
			return false;
		}}
	public boolean checkBlankMobileNo ()throws Throwable{
		Generics.click1(Register1);
		Generics.sendkeys1(mobile1, "");
		Generics.click1(signinButton);
		String actualBlankMobileNo=Generics.getText1(blankMobileNo); 
		System.out.println(actualBlankMobileNo);
		String expectedBlankMobileNo="Please enter Mobile.";

		if(actualBlankMobileNo.equals(expectedBlankMobileNo))
		{
			System.out.println("page BlankMobileNo matched");
			return true;
		}
		else
		{
			System.out.println("page BlankMobileNo not matched");
			return false;
		}}
	public boolean checkValidMobileNo ()throws Throwable{
		Generics.click1(Register1);
		Generics.sendkeys1(mobile1, "1111111111");
		Generics.click1(signinButton);
		String actualValidMobileNo=Generics.getText1(validMobileNo); 
		String expectedValidMobileNo="";

		if(actualValidMobileNo.equals(expectedValidMobileNo))
		{
			System.out.println("page ValidMobileNo matched");
			return true;
		}
		else
		{
			System.out.println("page ValidMobileNo not matched");
			return false;
		}}
	public boolean checkBlankEmail ()throws Throwable{
		Generics.click1(Register1);
		Generics.sendkeys1(username, "");
		Generics.click1(signinButton);
		String actualBlankEmail=Generics.getText1(email);
		System.out.println(actualBlankEmail);
		String expectedBlankEmail="Please enter Email.";

		if(actualBlankEmail.equals(expectedBlankEmail))
		{
			System.out.println("page BlankEmail matched");
			return true;
		}
		else
		{
			System.out.println("page BlankEmail not matched");
			return false;
		}}
	public boolean checkInvalidEmail ()throws Throwable{
		Generics.click1(Register1);
		Generics.sendkeys1(username, "abcd@");
		Generics.click1(signinButton);
		String actualInvalidEmail=Generics.getText1(email);
		String expectedInvalidEmail="Please enter valid email.";

		if(actualInvalidEmail.equals(expectedInvalidEmail))
		{
			System.out.println("page InvalidEmail matched");
			return true;
		}
		else
		{
			System.out.println("page InvalidEmail not matched");
			return false;
		}}
	public boolean checkBlankPassword ()throws Throwable{
		Generics.click1(Register1);
		Generics.sendkeys1(password, "");
		Generics.click1(signinButton);
		String actualBlankPassword=Generics.getText1(password1);
		String expectedBlankPassword="Please enter Password.";

		if(actualBlankPassword.equals(expectedBlankPassword))
		{
			System.out.println("page BlankPassword matched");
			return true;
		}
		else
		{
			System.out.println(" BlankPassword not matched");
			return false;
		}}
	public boolean checkPassword ()throws Throwable{

		Generics.click1(Register1);
		Generics.sendkeys1(password, "123456");
		Generics.click1(signinButton);
		String actualPassword=Generics.getText1(password);
		String expectedPassword="";

		if(actualPassword.equals(expectedPassword))
		{
			System.out.println(" Password matched");
			return true;
		}
		else
		{
			System.out.println("Password not matched");
			return false;
		}}
	public boolean checkRegPage1 ()throws Throwable{

		Generics.click1(Register1);

		String actualDashboard1=driver.getTitle();
		String expectedDashboard1="JavaByKiran | Registration Page";

		if(actualDashboard1.equals(expectedDashboard1))
		{
			System.out.println("Registration  matched");
			return true;
		}
		else
		{
			System.out.println("Registration not matched");
			return false;
		}}

	public boolean checkPlaceholderMobile ()throws Throwable{

		Generics.click1(Register1); 
		String actualPlaceholderMobile=Generics.getattribute(mobile1, "placeholder");
		System.out.println("print value of placeholder: "+actualPlaceholderMobile);
		String expectedPlaceholderMobile="Mobile";
		if(actualPlaceholderMobile.equals(expectedPlaceholderMobile))
		{
			System.out.println(" PlaceholderMobile matched");
			return true;
		}
		else
		{
			System.out.println("PlaceholderMobile not matched");
			return false;
		}}

	public boolean checkPlaceholderEmail ()throws Throwable{
		Generics.click1(Register1);
		String actualPlaceholderEmail=Generics.getattribute(username, "placeholder");

		System.out.println("print value of placeholder: "+actualPlaceholderEmail);
		String expectedPlaceholderEmail="Email";
		if(actualPlaceholderEmail.equals(expectedPlaceholderEmail))
		{
			System.out.println(" PlaceholderEmail matched");
			return true;
		}
		else
		{
			System.out.println("PlaceholderEmail not matched");
			return false;
		}}


	public boolean checkPlaceholderPassword ()throws Throwable{
		Generics.click1(Register1);
		String actualPlaceholderPassword=Generics.getattribute(password, "placeholder");

		System.out.println("print value of placeholder: "+actualPlaceholderPassword);
		String expectedPlaceholderPassword="Password";
		if(actualPlaceholderPassword.equals(expectedPlaceholderPassword))
		{
			System.out.println(" PlaceholderPassword matched");
			return true;
		}
		else
		{
			System.out.println("PlaceholderPassword not matched");
			return false;
		}}

	public boolean checkPasswordErrorMsg ()throws Throwable{
		Generics.sendkeys1(username, "kiran@gmail.com");
		Generics.sendkeys1(password, "123");
		Generics.click1(signinButton);
		String actualErrorMsg=Generics.getText1(password1);
		System.out.println(actualErrorMsg);
		String expectedErrorMsg="Please enter password 123456";

		if(actualErrorMsg.equals(expectedErrorMsg))
		{
			System.out.println("Error message matched");
			return true;
		}
		else
		{
			System.out.println("Error message not matched");
			return false;
		}}

	public boolean checkEmailErrorMsg ()throws Throwable{
		Generics.sendkeys1(username, "abc@gmail.com");
		Generics.sendkeys1(password, "123456");
		Generics.click1(signinButton);
		String actualErrorMsg=Generics.getText1(email);
		System.out.println(actualErrorMsg);
		String expectedErrorMsg="Please enter email as kiran@gmail.com";

		if(actualErrorMsg.equals(expectedErrorMsg))
		{
			System.out.println("Error message matched");
			return true;
		}
		else
		{
			System.out.println("Error message not matched");
			return false;
		}}
}

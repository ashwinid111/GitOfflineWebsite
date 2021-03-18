package com.jbk.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import com.ObjectRepositary.DashboardRepo;

public class DashboardPage extends DashboardRepo {
	WebDriver driver;
	
public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public boolean dashboardheading(){
		String actheading=heading.getText();
		String expheading="Dashboard Courses Offered";
		if(actheading.equals(expheading)) {
			System.out.println("Title matched");
		return  true;
		}
	return false;
	}
	
public boolean courses() {
		ArrayList<String> expdata=new ArrayList<String>();
		expdata.add("Selenium");
		expdata.add("Java / J2EE");
		expdata.add("Python");
		expdata.add("Php");
		System.out.println("print expected data : "+expdata);
		
       ArrayList<String>actualCourses=new ArrayList<String>();
		for(WebElement courseName: listOfCourses) {
			actualCourses.add(courseName.getText());
		}
		System.out.println("print actual list of courses:"+actualCourses);
		
		return true;
		}	

public boolean verifycourses() {
	ArrayList<String> expcourse=new ArrayList<>();
	expcourse.add("Automation Testing");
	expcourse.add("Software Development");
	expcourse.add("Data Science");
	expcourse.add("Web Development");
	System.out.println("expected courses : "+expcourse);
	
	ArrayList<String>actCourse=new ArrayList<String>();
	for(WebElement subCourseName : subCourses) {
		actCourse.add(subCourseName.getText());
		System.out.println("subcourses : "+actCourse);
	}
	
	return true;
}

public boolean dashboardcontent() {
	ArrayList<String>expcont=new ArrayList<>();
	expcont.add("Dashboard");
	expcont.add("Users");
	expcont.add("Operators");
	expcont.add("Useful Links");
	expcont.add("Downloads");
	expcont.add("Logout");

ArrayList<String>actcont=new ArrayList<>();
for(WebElement subcont1: subcont) {
	actcont.add(subcont1.getText());
	System.out.println("subcontents===" +subcont);
}
return true;
}

public boolean automationtesting() {
	Automationtesting.click();
	return true;
	}

public boolean softwaredevelopment() {
	Softwaredevelopment.click();
	return true;
}
public boolean datascience() {
	Datascience.click();
	return true;
}

public boolean webdevlopment() {
	WebDevelopment.click();
	return true;
}

public boolean JavaByKiran() {
	String acthead=jbk.getText();
	System.out.println("Actual header===="+acthead);
	String exphead="Java By Kiran";
	return true;
}

}





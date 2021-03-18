package com.ObjectRepositary;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardRepo {
@FindBy(tagName = "h1")
public WebElement heading;

@FindBy(tagName = "h3")
public List<WebElement> listOfCourses;

@FindBy(xpath = "//div[@class='inner']//following::p")
public List<WebElement> subCourses;

@FindBy(xpath = "//li[@class='active treeview']//following::span")
public List<WebElement> subcont;

@FindBy(xpath = "//a[@href='../pdf/selenium-testing-syllabus-jbk.pdf']")
public WebElement Automationtesting;

@FindBy(xpath = "//a[@href='../pdf/java-j2ee-syllabus-jbk.pdf']")
public WebElement Softwaredevelopment;

@FindBy(xpath = "//a[@href='../pdf/python-syllabus.pdf']")
public WebElement Datascience;

@FindBy(xpath = "//p[text()='Web Development']//following::a[@href='#']")
public WebElement WebDevelopment;

@FindBy(xpath = "//span[@class='logo-lg']")
public WebElement jbk;

@FindBy(xpath="//span[text()='Users']")
public WebElement userpage11;
}


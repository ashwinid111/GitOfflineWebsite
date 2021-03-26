package com.jbk.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.jbk.UsefulLinksPage.UsefulLinksPage;

public class ExtentUtility {
	
		public WebDriver driver;
		public ExtentHtmlReporter htmlReporter;
		public ExtentReports extent;
		public ExtentTest test;
		UsefulLinksPage Up ;
		@BeforeTest
		public void startReport() {
			htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/Report.html");
	        	
			extent = new ExtentReports();  
			extent.attachReporter(htmlReporter);           
			extent.setSystemInfo("Host Name", "SoftwareTestingMaterial");
	        	extent.setSystemInfo("Environment", "Production");
			extent.setSystemInfo("User Name", "Dipa");
			htmlReporter.config().setDocumentTitle("Extent Report Doc "); 
	                // Name of the report
			htmlReporter.config().setReportName("Extent Report Demo"); 
	                // Dark Theme
			htmlReporter.config().setTheme(Theme.STANDARD);			
		}
		
		//This method is to capture the screenshot and return the path of the screenshot.
		
	 
		@BeforeMethod
		public void setup() {
			driver = new ChromeDriver();
			driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/links.html");
			Up = new UsefulLinksPage (driver);
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		}@AfterMethod
		public void getResult(ITestResult result) throws IOException{
			if(result.getStatus() == ITestResult.FAILURE){
				//MarkupHelper is used to display the output in different colors
				test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
				test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
				//To capture screenshot path and store the path of the screenshot in the string "screenshotPath"
				//We do pass the path captured by this method in to the extent reports using "logger.addScreenCapture" method. 
				//String Scrnshot=TakeScreenshot.captuerScreenshot(driver,"TestCaseFailed");
				
				//To add it in the extent report 
				
			}
			else if(result.getStatus() == ITestResult.SKIP){
				test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE)); 
			} 
			else if(result.getStatus() == ITestResult.SUCCESS)
			{
				test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
			}
			driver.close();
		}
		
	

	@AfterTest
	public void endReport() {
		extent.flush();
		
	}
	}



package com.jbk.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.jbk.utility.TestUtility;

public class TestBase {
	 public static WebDriver driver;
	 public static Properties prop;
	 
	 public TestBase(){
		 try{
			 prop = new Properties();
			 FileInputStream fp = new FileInputStream("C:/Users/LOGITECH/git/GitOfflineWebsite12/src/main/resources/config.properties");
			 prop.load(fp);
		 }catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	 }
	 
	 public static void initialization(){
		 String browserName= prop.getProperty("browser");
		 if(browserName.equals("chrome")){
			 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			 driver=new ChromeDriver();
		 }else if(browserName.equals("chrome")){
			 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			 driver=new ChromeDriver();
		 }
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(TestUtility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		 //driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		 driver.manage().timeouts().implicitlyWait(TestUtility.Implicit_WAIT, TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));
	 }

		
}

package com.jbk.utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generics {
	public static void click1(WebElement element){
		element.click();
	}
	public static void sendkeys1(WebElement web,String val){
		web.sendKeys(val);
	}
	public static String getattribute(WebElement placeholder,String name){
		return placeholder.getAttribute(name);
		
	}
	 public static String getText1(WebElement ele){
			return ele.getText();
			 
		 }
	 //rutikas code
	 public static void ClickButton(WebElement element){
			element.click();
			
		}
		public static void SendKeysValue(WebElement web,String value){
			web.sendKeys(value);
		}
		public static void ClearData(WebElement element){
			element.clear();
		}
		public static void SendKeysValue1(WebElement Web, String Value, int i, int j) {
			Web.sendKeys(Value);
		}
		public static String AlertHandel(WebDriver driver){

			Alert alert= driver.switchTo().alert();
		String actulAlertMsg =   alert.getText();
			alert.accept();	
			return actulAlertMsg;
		}	
}

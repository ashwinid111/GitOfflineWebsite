package com.jbk.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OperatorPage212 {
	WebDriver driver=null;
	OperatorPage212 Op=null;
	@FindBy(tagName="tr")
	private List<WebElement> tr1;
	@FindBy(tagName="td")
	private List<WebElement> td1;
	@FindBy(xpath="//td[4]")
	private List<WebElement> contactWay;
	@FindBy(xpath="//td[2]")
	private List<WebElement >personList;
	@FindBy(xpath="//tr//th")
	private List <WebElement> listOfHeaderList;
	@FindBy(tagName="h1")
	private WebElement actualHeader;
	@FindBy(xpath="//td[6]//b")
	private List <WebElement> rowdata ;
	@FindBy(xpath="//td[2]")
	private List <WebElement> col1;
	@FindBy(xpath="//td[4]")
	private List <WebElement> coldata1 ;
	@FindBy(xpath="//td[2]")
	private List <WebElement> coldata ;
	@FindBy(xpath="//td[6]")
	private List <WebElement> rowdata1 ;
	@FindBy(xpath="//td[3]")
	private List <WebElement> coldata2 ;
	@FindBy(xpath="//tr//td[2]")
	private List <WebElement> td4 ;
	@FindBy(xpath="//h3")
	private WebElement actualHeaders;
	

	public OperatorPage212(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public Boolean printData() {
		
		//WebElement Table = driver.findElement(By.xpath("//table[@class='table table-hover']"));
		//List<WebElement> tr1 = Table.findElements(By.tagName("tr"));
		System.out.println("total no of row " + tr1.size());
		for (WebElement row1 : tr1) {
			//List<WebElement> td1 = row1.findElements(By.tagName("td"));
			System.out.println(row1);
			for (WebElement col1 : td1) {
             System.out.println(col1.getText());

			}
		}
		return true;
	}
	
	public Boolean test2() {
		ArrayList<String> pername = new ArrayList<String>();
		pername.add("Kiran");
		pername.add("Neelam");
		pername.add("Seema");
		pername.add("Varsha");
		pername.add("Darshit");
		Collections.sort(pername);
		System.out.println(pername);
		return true;
	}


	public Boolean sortElem() {
		
		//WebElement Table = driver.findElement(By.xpath("//table[@class='table table-hover']"));
		//List<WebElement> tr1 = Table.findElements(By.tagName("tr"));
		ArrayList<String> obtainedList = new ArrayList<>();
		//List<WebElement> td1 = Table.findElements(By.tagName("td"));
		for (WebElement col1 : td1) {
			obtainedList.add(col1.getText());
		}
		ArrayList<String> sortedList = new ArrayList<>();
		for (String s : obtainedList) {
			sortedList.add(s);
		}Collections.sort(sortedList);
		System.out.println(sortedList);
		//Assert.assertTrue(sortedList.equals(obtainedList));
		if(sortedList.equals(obtainedList))
		{
			
		System.out.println("true");	
			return true;
		}else
		{
			System.out.println("false");
			return false;
		}
		

	}
	public Boolean checkWhatappnPhone() {
		
		//List<WebElement> contactWay = driver.findElements(By.xpath("//td[4]"));// 5
		//List<WebElement> personList = driver.findElements(By.xpath("//td[2]"));// 5
		System.out.println("operatorPage2");
		for (int i = 0; i < contactWay.size(); i++) {
			String person = contactWay.get(i).getText();
			if (person.contains("Whats App") && person.contains("Phone Call")) {
				String personName = personList.get(i).getText();
				System.out.println("print here which person available on whatsApp n phone calls..." + personName);

			}
		}return true;
	}

	public int hedar() {
		
		ArrayList<String> actualHeaders = new ArrayList<String>();
		//List<WebElement> listOfHeaderList = driver.findElements(By.xpath("//tr//th"));
		for (WebElement listOfHeaderName : listOfHeaderList) 
			actualHeaders.add(listOfHeaderName.getText());
		
		System.out.println(actualHeaders);
		System.out.println("actual size of headerList>>>> " + actualHeaders.size());

		return actualHeaders.size();
		
		}

	

public Boolean verifyTitledData() {
	
	//WebElement actualHeader = driver.findElement(By.tagName("h1"));

	String expectHeader = "Operators";
	//Assert.assertEquals(actualHeader.getText(), expectHeader);
if(actualHeader.getText().equals(expectHeader)){
	
	System.out.println("true");
	return true;
}
else{
	
	System.out.println("false");
	return false;
}
}
public  Boolean findday() {
	

	//List<WebElement> rowdata = driver.findElements(By.xpath("//td[6]//b"));
	//List<WebElement> col1 = driver.findElements(By.xpath("//td[2]"));
	for (int i = 0; i < rowdata.size(); i++) {
		String data = rowdata.get(i).getText();
		// System.out.println(data);
		if (data.contains("Monday-Saturday")) {
			String data1 = col1.get(i).getText();
			System.out.println(data1);
return true;
		}

	}
	return false;
}


public Boolean test04() {

	
	//List<WebElement> rowdata = driver.findElements(By.xpath("//td[6]"));
	//List<WebElement> coldata = driver.findElements(By.xpath("//td[2]"));
	//List<WebElement> coldata1 = driver.findElements(By.xpath("//td[4]"));
	for (int i = 0; i < rowdata1.size(); i++) {
		String text = rowdata1.get(i).getText();
		// System.out.println("step3"+text);
		for (int j = 0; j < coldata1.size(); j++) {
			String text2 = coldata1.get(j).getText();
			// System.out.println("step3"+text2);
			if (text.contains("Whats App") && text2.contains("09:00 AM to 06:00 PM Monday-Saturday")) {
				String data = coldata.get(i).getText();

				System.out.println("person only on Whats App and week" + data);
			}
		}
	}return true;
}
public Boolean PersonWithTechnicleHelp() {

	
	// List<WebElement>rowdata=driver.findElements(By.xpath("//td[6]"));

	//List<WebElement> coldata = driver.findElements(By.xpath("//td[2]"));
	//List<WebElement> coldata2 = driver.findElements(By.xpath("//td[3]"));
	for (int j = 0; j < coldata.size(); j++) {
		String text2 = coldata2.get(j).getText();
		// System.out.println("step3"+text2);
		if (text2.contains("Technical")) {
			String data = coldata.get(j).getText();
			System.out.println("person name" + " " + data);
		}

	}return true;
}
public Boolean PersonWithWhatsapp() {

	
	// List<WebElement>rowdata=driver.findElements(By.xpath("//td[6]"));

	//List<WebElement> coldata = driver.findElements(By.xpath("//td[2]"));
	//List<WebElement> coldata1 = driver.findElements(By.xpath("//td[4]"));
	for (int j = 0; j < coldata.size(); j++) {
		String text2 = coldata1.get(j).getText();
		// System.out.println("step3"+text2);
		if (text2.contains("Whats App ")) {
			String data = coldata.get(j).getText();
			System.out.println("person name" + " " + data);
		}

	}return true;
}
public Boolean PersonWithWhatsappOnly() {

	
	
	// List<WebElement>rowdata=driver.findElements(By.xpath("//td[6]"));

	//List<WebElement> coldata = driver.findElements(By.xpath("//td[2]"));
	//List<WebElement> coldata1 = driver.findElements(By.xpath("//td[4]"));
	for (int j = 0; j < coldata.size(); j++) {
		String text2 = coldata1.get(j).getText();
		// System.out.println("step3"+text2);
		if (text2.contains("Whats App Only")) {
			String data = coldata.get(j).getText();
			System.out.println("person name" + " " + data);
		}

	}return true;
}

public boolean printColumnData() {
	
	//List<WebElement> td1 = driver.findElements(By.xpath("//tr//td[2]"));
	for (int i = 1; i > 6; i++) {
		String text2 = td4.get(i).getText();
		System.out.println(text2);
	}
	return true;
}

@Test(priority = 13)
public Boolean headerSmallName() {
	
	WebElement actualHeaders = driver.findElement(By.xpath("//h3"));
	String expectedHeader = "Operator List";

	//Assert.assertEquals(actualHeaders.getText(), expectedHeader);
	if(actualHeaders.equals(expectedHeader))
	{
		System.out.println("header match");
		System.out.println(actualHeaders.getText());
		return true;
	}else{
		System.out.println("geader not match");
		return false;
	
	
}
}
}




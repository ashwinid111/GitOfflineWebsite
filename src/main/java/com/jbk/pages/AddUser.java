package com.jbk.pages;




import java.io.FileInputStream;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jbk.utility.Generics;

import jxl.Sheet;
import jxl.Workbook;

public class AddUser extends com.ObjectRepositary.AddUserObjectRespositery{
	WebDriver driver;
	FileInputStream fileInputStream =null;
	Workbook workbook =null;
	Sheet sheet=null;
	
	public AddUser(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void openUserPage() {
		Generics.SendKeysValue(email,"kiran@gmail.com" );
		Generics.SendKeysValue(password, "123456");
		Generics.ClickButton(loginButton);
		Generics.ClickButton(users);
		Generics.ClickButton(addUser);
	}

	public String [][] readExcel() throws Exception{
		fileInputStream = new FileInputStream("DataExcelSheet.xls");
		workbook = Workbook.getWorkbook(fileInputStream);
		sheet =workbook.getSheet("adduser");
		String [][] dataArray = new String[sheet.getRows()-1][sheet.getColumns()];
		for (int i = 1; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				String data =sheet.getCell(j, i).getContents();
				dataArray[i-1][j]=data;
			}
		}	return dataArray;
	}

	public String[][] readDataProvider() {
		String [][] dataArray = new String[2][7];
		dataArray [0][0] = "Rutika";
		dataArray [0][1] = "9689183196";
		dataArray [0][2] = "rutikasonkusare@gmail.com";
		dataArray [0][3] = "Selenium";
		dataArray [0][4] = "Female";
		dataArray [0][5] = "Maharashtra";
		dataArray [0][6] = "Rutika@15";
		dataArray [1][0] = "Ruti";
		dataArray [1][1] = "8956289135";
		dataArray [1][2] = "sonkusarerutika@gmail.com";
		dataArray [1][3] = "Java/J2EE";
		dataArray [1][4] = "Female";
		dataArray [1][5] = "Punjab";
		dataArray [1][6] = "kunal1234";
		return dataArray;
	}

	public String readData(String sheets, int row ,int coloum) throws Exception{
		fileInputStream = new FileInputStream("DataExcelSheet.xls");
		workbook = Workbook.getWorkbook(fileInputStream);
		sheet =workbook.getSheet(sheets);
		return sheet.getCell(row, coloum).getContents();
	}

	public boolean addUser(String userName, String  mobile, String email,String courses, String genders, String states, String password) {

		String expectedAlertMsg ="User Added Successfully. You can not see added user.";
		openUserPage();		
		Generics.ClearData(username);
		
		Generics.SendKeysValue(username, userName);
		Generics.ClearData(userMobile);
		Generics.SendKeysValue(userMobile, mobile);
		Generics.ClearData(userEmail);
		Generics.SendKeysValue(userEmail, email);
		Generics.ClearData(course);
		Generics.SendKeysValue(course,courses);
		if (genders.equals("Female")) {

			Generics.ClickButton(	male);
		}else {
			Generics.ClickButton(	female);
		}    	
		WebElement state = stateSelect;
		Select select = new Select(state);
		select.selectByVisibleText(states);
		
		Generics.ClearData(userPassword);
		Generics.SendKeysValue(userPassword, password);
		Generics.ClickButton(submitButton);
			
		String actulAlertMsg=Generics.AlertHandel(driver);
		if (expectedAlertMsg.equals(actulAlertMsg)) {
			System.out.println("User Data Add Successfully");
			return true;
		}else {
			System.out.println("User Data Not Add Successfully");
			return false;
		}
	}

	public boolean addUser() throws Exception {

		String expectedAlertMsg ="User Added Successfully. You can not see added user.";
//	String actulAlertMsg =null;
		readData("adduser", 0, 0);
	
		Generics.SendKeysValue1(email,"login", 0, 1);
		Generics.SendKeysValue1(password,"login", 1, 1);
		Generics.ClickButton(loginButton);
		Generics.ClickButton(users);
		Generics.ClickButton(addUser);
		for (int i = 1; i < sheet.getRows(); i++) {
		
			Generics.ClearData(username);
			Generics.SendKeysValue1(	username,"adduser", 0, i);
			
			Generics.ClearData(userMobile);
			
			Generics.SendKeysValue1(	userMobile,"adduser", 1, i);

			Generics.ClearData(userEmail);
		

			Generics.SendKeysValue1(	userEmail,"adduser", 2, i);
			Generics.ClearData(course);
			
			Generics.SendKeysValue1(	course,"adduser", 3, i);
			String genders = readData("adduser", 4, i);
			if (genders.equals("Male")) {
				Generics.ClickButton(	male);
			}else {
				Generics.ClickButton(	female);
			}   	
			WebElement state = stateSelect;
			Select select = new Select(state);
			select.selectByVisibleText(readData("adduser", 5, i));    	
			
			Generics.ClearData(userPassword);
			
			Generics.SendKeysValue1(	userPassword,"adduser", 6, i);
		
			Generics.ClickButton(submitButton);
	
			String actulAlertMsg=Generics.AlertHandel(driver);
		
		if (expectedAlertMsg.equals(actulAlertMsg)) {
			System.out.println("User Data Add Successfully");
			return true;
		}else {
			System.out.println("User Data Not Add Successfully");
			return false;
		}}
		return false;
	}

	public boolean AddUserAlert() {
		String expectedAlertMessage="User Added Successfully. You can not see added user.";
		
		Generics.SendKeysValue(username,"Rutika");
		Generics.SendKeysValue(userMobile,"9689183196");
		Generics.SendKeysValue(userEmail,"rutikasonkusare@gmail.com");
		
		Generics.SendKeysValue(course,"Selenium");
		
	
		String genders = "Female";
		if (genders.equals("Female")) {
			driver.findElement(By.id("Male")).click();
		}else {
			driver.findElement(By.id("Female")).click();
		}	
		WebElement state = stateSelect;
		Select select = new Select(state);
		select.selectByVisibleText("Maharashtra");
		
		Generics.SendKeysValue(userPassword,"Rutika@15");
		Generics.ClickButton(submitButton);
		
		String actulAlertMsg=Generics.AlertHandel(driver);
		if (expectedAlertMessage.equals(actulAlertMsg)) {
			System.out.println(" Alert Message Successfully PopUp On The Window ");
			return true;
		}else {
			System.out.println("Alert Message Not Successfully PopUp On The Window");
			return false;
		}
	}

	public boolean userPage() {

		String expectedPageName="Users";   	 

		Generics.ClickButton(cancelButton);
		if (expectedPageName.equals(userHeader.getText())) {
			System.out.println("User Page Successfully Open After Cancel Operation");
			return true;
		}else {
			System.out.println("User Page Not Successfully Open After Cancel Operation");
			return false;
		}

	}

	public boolean addUserBoxTitle() {
		openUserPage();
		String expectedAddUserBoxTitle="Fill Below Details";
		String actualAddUserBoxTitle = driver.findElement(By.xpath("//h3[text()='Fill Below Details']")).getText();
		if (expectedAddUserBoxTitle.equals(actualAddUserBoxTitle)) {
			System.out.println(expectedAddUserBoxTitle+" Is A Box Title Of Add Users and It Is Avilable in Add User");
			return true;
		}else {
			System.out.println("There Is No Box Title Available In Add Users");
			return false;
		}
	}

	public boolean navigationsTitle() {
		ArrayList<String> expectedNavigationTitle = new ArrayList<String>();
		expectedNavigationTitle.add("Dashboard");
		expectedNavigationTitle.add("Users");
		expectedNavigationTitle.add("Operators");
		expectedNavigationTitle.add("Useful Links");
		expectedNavigationTitle.add("Downloads");
		expectedNavigationTitle.add("Logout");
		ArrayList<String> actualNavigationTitle = new ArrayList<String>();
		for (WebElement list : navigationList) {
			String elements = list.getText();
			actualNavigationTitle.add(elements);
		}
		for (int i=0;i<actualNavigationTitle.size();i++) {
			if (expectedNavigationTitle.get(i).equals(actualNavigationTitle.get(i))) {				
				System.out.println("Navigation Page Title Match Successfully");
				//return true;
			}else {
				System.out.println("Navigation Page Title Not Match Successfully");
				return false;
			}
		}return true;

	}
}



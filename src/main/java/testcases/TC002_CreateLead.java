package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		System.out.println("Before Test");
		testCaseName="TC002_CreateLead";
		testDescription="Login to LeafTaps And Create a new lead";
		testNodes="Leads";
		category="Smoke";
		authors="Arun";
		browserName="chrome";
		dataSheetName="TC002_CreateLead";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String uName, String passWord, String companyName, String firstName, String lastName, String phoneNumber, String emailID) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(passWord)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterPhoneNumber(phoneNumber)
		.enterEmailID(emailID)
		.clickCreateLead();
	}

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{

	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	WebElement strCompanyName;
	public CreateLeadPage enterCompanyName(String data) {
		//WebElement strCompanyName = locateElement("createLeadForm_companyName");
		type(strCompanyName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	WebElement strFirstName;
	public CreateLeadPage enterFirstName(String data) {
		//WebElement strFirstName = locateElement("createLeadForm_firstName");
		type(strFirstName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	WebElement strLastName;
	public CreateLeadPage enterLastName(String data) {
		//WebElement strFirstName = locateElement("createLeadForm_firstName");
		type(strLastName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	WebElement phoneNumber;
	public CreateLeadPage enterPhoneNumber(String data) {
		//WebElement phoneNumber = locateElement("createLeadForm_primaryPhoneNumber");
		type(phoneNumber, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	WebElement emailID;
	public CreateLeadPage enterEmailID(String data) {
		//WebElement emailID = locateElement("createLeadForm_primaryEmail");
		type(emailID, data);
		return this;
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	WebElement btnCreateLead;
	public ViewLeadPage clickCreateLead() {
		//WebElement btnCreateLead = locateElement("name", "submitButton");
		click(btnCreateLead);
		return new ViewLeadPage();
	}
}

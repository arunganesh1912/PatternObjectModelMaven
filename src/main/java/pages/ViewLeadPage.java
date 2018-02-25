package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH, using="//span[@id = 'viewLead_companyName_sp']")
	WebElement leadID;
	public ViewLeadPage verifyLeadID(String expectedText) {
		//WebElement leadID = locateElement("xpath","//span[@id = 'viewLead_companyName_sp']");
		verifyPartialText(leadID, expectedText);
		return this;
	}

	@FindBy(how=How.XPATH, using="//span[@id = 'viewLead_companyName_sp']")
	WebElement companyName;
	public ViewLeadPage verifyCompanyName(String expectedText) {
		//WebElement leadID = locateElement("xpath","//span[@id = 'viewLead_companyName_sp']");
		verifyPartialText(companyName, expectedText);
		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "Edit")
	private WebElement editButton;
	public EditLeadPage clickEditButton() {
		//WebElement editButton = locateElement("link", "Edit");;
		click(editButton);
		return new EditLeadPage();
	}

	@FindBy(how = How.LINK_TEXT, using = "Delete")
	private WebElement btnDeleteLead;
	public LeadsPage clickDeleteButton() {
		//WebElement btnDeleteLead = locateElement("link", "Delete");
		click(btnDeleteLead);
		return new LeadsPage();
	}

	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicateButton;

	public DuplicateLeadPage clickDuplicate()
	{
		click(eleDuplicateButton);
		return new DuplicateLeadPage();

	}

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVerifyFirst;

	public ViewLeadPage verifyFirstName(String data) {
		verifyPartialText(eleVerifyFirst, data);	
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement findLeadsButton;
	public FindLeadsPage clickFindLeads() {
		//To Click Find Leads	
		//WebElement findLeadsButton = locateElement("xpath", "//button[text()='Find Leads']");
		click(findLeadsButton);
		return new FindLeadsPage();
	}
}

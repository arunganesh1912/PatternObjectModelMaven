package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LeadsPage extends ProjectMethods{

	public LeadsPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement linkCreateLead;
	public CreateLeadPage clickCreateLead() {
		//To Click Create Lead		
		//WebElement linkCreateLead = locateElement("link", "Create Lead");
		click(linkCreateLead);
		return new CreateLeadPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement findLeads;
	public FindLeadsPage clickFindLeads() {
		//To Click Find Leads	
		//WebElement findLeadsButton = locateElement("xpath", "//button[text()='Find Leads']");
		click(findLeads);
		return new FindLeadsPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLeadClick;

	public MergeLeadPage  clickMergeLead() {
		click(eleMergeLeadClick);
		return new MergeLeadPage();
	}

}

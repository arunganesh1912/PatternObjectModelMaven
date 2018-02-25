package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{

	public DuplicateLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLeadButton;
	public ViewLeadPage clickCreateLead() {
		click(eleCreateLeadButton);	
		return new ViewLeadPage();

	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLeadButtonMerge;
	public LeadsPage clickCreateLeadMerge() {
		click(eleCreateLeadButtonMerge);	
		return new LeadsPage();

	}
}
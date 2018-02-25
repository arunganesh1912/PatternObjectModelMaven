package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{

	public MergeLeadPage() {
		PageFactory.initElements(driver,this);
	}


	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleFromLeadIcon;

	public FindLeadsPage clickFromLead() {
		click(eleFromLeadIcon);	
		switchToWindow(1);
		return new FindLeadsPage();

	}
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleToLeadIcon;

	public FindLeadsPage clickToLead() {
		click(eleToLeadIcon);	
		switchToWindow(1);
		return new FindLeadsPage();

	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleMergeLeadButton;

	public ViewLeadPage clickMergeLeadButton() {
		click(eleMergeLeadButton);	
		acceptAlert();
		return new ViewLeadPage();

	}
	
}
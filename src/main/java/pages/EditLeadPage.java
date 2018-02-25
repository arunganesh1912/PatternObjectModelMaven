package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{
	
	public EditLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "updateLeadForm_companyName")
	private WebElement companyName; 
	public EditLeadPage enterUpdatedCompanyName(String data) {
		//WebElement strCompanyName = locateElement("updateLeadForm_companyName");
		type(companyName, data);
		return this;
	}
	
	@FindBy(how = How.NAME, using = "submitButton")
	private WebElement btnUpdate;
	public ViewLeadPage clickUpdateButton() {
		//WebElement editButton = locateElement("name", "submitButton");;
		click(btnUpdate);
		return new ViewLeadPage();
	}

}

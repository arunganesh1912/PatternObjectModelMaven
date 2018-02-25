package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	
	public FindLeadsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "(//input[contains(@name,'firstName')])[3]")
	private WebElement firstName; 
	public FindLeadsPage enterFirstName(String data) {
		//WebElement firstName = locateElement("xpath", "(//input[contains(@name,'firstName')])[3]");
		type(firstName, data);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(.,'Phone')]")
	private WebElement tabPhone; 
	public FindLeadsPage clickPhoneTab() {
		//WebElement tabPhone = locateElement("xpath", "//span[contains(.,'Phone')]");
		click(tabPhone);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//span[contains(.,'Email')]")
	private WebElement tabEmail; 
	public FindLeadsPage clickEmailTab() {
		//WebElement tabPhone = locateElement("xpath", "//span[contains(.,'Phone')]");
		click(tabEmail);
		return this;
	}

	@FindBy(how = How.NAME, using = "phoneNumber")
	private WebElement phoneNumber; 
	public FindLeadsPage enterPhoneNumber(String data) {
		//WebElement phoneNumber = locateElement("name","phoneNumber");
		type(phoneNumber, data);
		return this;
	}
	
	@FindBy(how = How.NAME, using = "emailAddress")
	private WebElement emailAddress; 
	public FindLeadsPage enterEmailAddress(String data) {
		//WebElement emailAddress = locateElement("name","emailAddress");
		type(emailAddress, data);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	private WebElement findLeadsButton;
	public FindLeadsPage clickFindleadsButton() {
		//WebElement findLeadsButton = locateElement("xpath", "//button[text()='Find Leads']");
		click(findLeadsButton);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement leadID;
	public String gettheLeadID() throws InterruptedException {
	
		Thread.sleep(5000);
		
		String data = getText(leadID);
		System.out.println(data);
		return data;
	}
	
	@FindBy(how = How.XPATH, using = "(//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']//a)[1]")
	private WebElement firstRecordName;
	public String getfirstRecordName() throws InterruptedException {
	
		Thread.sleep(5000);
		
		String data = getText(firstRecordName);
		System.out.println(data);
		return data;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']//a)[1]")
	private WebElement clickRecord;
	public ViewLeadPage clickFirstData() {
		//WebElement clickRecord1 = locateElement("xpath", "(//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']//a)[1]");
		clickWithNoSnap(clickRecord);
		return new ViewLeadPage();
	}
	
	@FindBy(how = How.NAME, using = "id")
	private WebElement leadId1;
	public FindLeadsPage enterLeadID(String data) {
		//WebElement leadId1 = locateElement("name", "id");
		System.out.println("DELETED LEAD ID"+data);
		type(leadId1,data);
		return this;
	}
	
	@FindBy(how = How.CLASS_NAME, using = "x-paging-info")
	private WebElement noRecordsVerify; 
	public FindLeadsPage verifyLeadDelete() {
		//WebElement noRecordsVerify = locateElement("class", "x-paging-info");
		verifyExactText(noRecordsVerify,"No records to display");
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[1]")					
	private WebElement eleFirstResultMerge;

	public MergeLeadPage clickFirstResultMerge() {
		click(eleFirstResultMerge);
		switchToWindow(0);
		return new MergeLeadPage();

	}
}

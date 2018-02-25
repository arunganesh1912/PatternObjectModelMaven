package wdMethods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class ProjectMethods extends SeMethods{

	public String browserName;
	public String dataSheetName;

	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Suite");
		startResult();
	}

	@BeforeClass
	public void beforeTest(){
		System.out.println("Before Class");
		startTestModule(testCaseName, testDescription);	
	}

	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method");
		test = startTestCase(testNodes);
		test.assignCategory(category);
		test.assignAuthor(authors);
		startApp(browserName);		
	}

	@AfterSuite
	public void afterSuite(){
		System.out.println("After Suite");
		endResult();
	}

	@AfterTest
	public void afterTest(){
		System.out.println("After Test");
	}

	@AfterMethod
	public void afterMethod(){
		System.out.println("After Method");
		endTestcase();
		closeAllBrowsers();

	}

	@DataProvider(name="fetchData")
	public  Object[][] getData(){
		return DataInputProvider.getSheet(dataSheetName);		
	}	

}

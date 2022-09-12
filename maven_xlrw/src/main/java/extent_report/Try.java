package extent_report;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Try {

	
	ExtentReports report;
	 ExtentTest test;
	@BeforeClass
	public  void startTest()
	{
		//creating an object for extent reports class, pass path as input, globally
	 report = new ExtentReports("/Users/varun/eclipse-workspace/maven_p2/src/main/java/extent_report/SP.html");
	 // test start ,finish, loging 
	 test = report.startTest("Try");
	 test.log(LogStatus.ERROR,"it may fail");
	 test.log(LogStatus.INFO,"in before class");
	 
	}
	@Test
	public void extentReportsDemo()
	{
	System.setProperty("webdriver.chrome.driver", "/Users/varun/Downloads/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	Assert.assertEquals(driver.getTitle(),"Google");
	test.log(LogStatus.PASS,"Test case passed ");
	test.setDescription("this is about google");
	driver.quit();
	
	}
	
	@AfterClass
	public void endTest()
	{
	test.log(LogStatus.INFO,"in after class");
	report.endTest(test);
	report.flush();
	}
	
}

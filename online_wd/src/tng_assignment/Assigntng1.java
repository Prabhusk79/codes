package tng_assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assigntng1 {

	// click on "appache poi" in seleniumeasy.com using assertion in test cases
	
    @Test
    public void select() throws InterruptedException
    {
	System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
	ChromeDriver d= new ChromeDriver();
	d.get("https://www.seleniumeasy.com/");
	Assert.assertNotEquals(d.getTitle(),"seleniumeasy");
	Thread.sleep(2000);
	WebElement ele = d.findElementByLinkText("Apache Poi");
	Thread.sleep(2000);
	Assert.assertTrue(ele.isDisplayed());
	ele.click();
	Thread.sleep(2000);
	d.quit();
    }
}

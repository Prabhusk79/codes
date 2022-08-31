package tng_frame;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertsoft {

	@Test
	public void visiting()
	{

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.google.com/");
		SoftAssert s=new SoftAssert();
		s.assertEquals(d.getTitle(),"yahoo");  // google,yahoo- fail
		s.assertNotEquals(d.getTitle(),"yahoo");  // google,yahoo -pass
		
		WebElement ele = d.findElementByLinkText("Terms");
		Assert.assertTrue(ele.isDisplayed()); // pass
		Assert.assertFalse(ele.isSelected()); //pass
		d.quit();
		
		// to show actual status of the test case=> invoke assertAll()
		s.assertAll();
}
}

package tng_frame;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserts {

	@Test
	public void visiting()
	{

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.google.com/");
		//Assert.assertEquals(d.getTitle(),"google");  // google,google- pass
		Assert.assertNotEquals(d.getTitle(),"yahoo");  // google,yahoo -pass
		
		WebElement ele = d.findElementByLinkText("Terms");
		Assert.assertTrue(ele.isDisplayed()); // pass
		Assert.assertFalse(ele.isSelected()); //pass
		d.quit();
	}
}

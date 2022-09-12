package folder1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C1 {

	@Test(groups="one")
	public void t1() throws InterruptedException
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

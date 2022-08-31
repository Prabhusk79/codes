package tng_frame;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Real {
	ChromeDriver d;
	
	@Test(priority=0,description="visiting",groups="A")
	public void visiting()
	{
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		d= new ChromeDriver();
		d.get("http://www.mycontactform.com");
	}
	
	@Test(priority=4,description="close",dependsOnGroups="A")
	public void close()
	{
		d.quit();
	}
	
	@Test(priority=2,description="refreshing",groups="A",invocationCount=2)
	public void refresh()
	{
		d.navigate().refresh();
	}
	
	@Test(priority=3,description="clicking",dependsOnGroups="A")
	public void click()
	{
		d.findElementByLinkText("Features").click();
	}
	@Test(priority=1,description="maximize",groups="A")
	public void max()
	{
		d.manage().window().maximize();
	}
}

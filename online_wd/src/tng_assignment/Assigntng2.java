package tng_assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assigntng2 {

	// perform login in facebook.com using test cases
	ChromeDriver d;
	
	@Test(priority=3)
	public void login() throws InterruptedException
	{
		 d.findElementById("loginbutton").click();
		 Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void pw()
	{
		 d.findElementById("pass").sendKeys("Prabhu@79");
	}
	
	@Test(priority=0)
	public void site() 
	{
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
	    d= new ChromeDriver();
		d.get("https://www.facebook.com/login/");
		
	}
	
	@Test(priority=1)
	public void un()
	{
	 d.findElementById("email").sendKeys("prabhuskcool@gmail.com");
	}
}

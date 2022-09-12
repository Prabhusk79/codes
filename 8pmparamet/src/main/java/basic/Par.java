package basic;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Par {

	@Parameters({"user","pass"})  // user=u,  pass=v
	@Test(groups="one")
	public void login(String u,String v) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "/Users/varun/Downloads/chromedriver");
		ChromeDriver d= new ChromeDriver();
		d.get("http://www.mycontactform.com");
		
		
		
		//id=user
		
		d.findElementById("user").sendKeys(u);
		
		// name=pass
		
		d.findElementByName("pass").sendKeys(v);
	    
		
		//classname=btn_log
		
		d.findElementByClassName("btn_log").click();
		Thread.sleep(2000);
		d.quit();
}
}

package folder2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C4 {

	@Test(groups="two")
	public void t4() throws InterruptedException
	{
		
	//  Click on "maven" in seleniumeasy.com
		
			System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
			ChromeDriver d= new ChromeDriver();
			d.get("https://www.seleniumeasy.com");
			d.manage().window().maximize();
			d.manage().window().fullscreen();
			Thread.sleep(4000);
			
			d.findElementByLinkText("Maven").click();
			Thread.sleep(4000);
			d.quit();
	}
}

package basic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignpar {
    @Parameters({"value"})  // value=v
	@Test(groups="two")
	public void login(String v) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "/Users/varun/Downloads/chromedriver");
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.google.com/");
		
		d.findElementByName("q").sendKeys(v);
		d.findElementByXPath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]").sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d.quit();
}
}

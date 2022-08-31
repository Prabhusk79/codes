package tng_assignment;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assigntng3 {

	// find the no of images present in yahoo.com
	ChromeDriver d;
	@Test
	public void visit()
	{
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
	    d= new ChromeDriver();
		d.get("https://www.google.com/");
		
	}
	@Test
	public void count()
	{
		List<WebElement> i=d.findElementsByTagName("img");
		System.out.println("no of images present is:"+i.size());
		d.quit();
	}
}

package tng_frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testng_listenannot.C1.class)  // packname.classname.class

public class Testngwaits {
	
	  //  Implicitly Wait
	@Test
	public void imw()
	{
		ChromeDriver d;
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
	    d= new ChromeDriver();
		d.get("http://www.google.com");
		d.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		System.out.println(d.getTitle());  // 4 secs
		System.out.println(d.getCurrentUrl()); // 4 secs
		d.navigate().refresh(); // 4 secs
		d.findElementByLinkText("Images").click();
		d.quit();
	}
}

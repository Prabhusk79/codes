package folder1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C2 {

	@Test(groups="one")
	public void t2()
	{
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
	   ChromeDriver d= new ChromeDriver();
		d.get("http://www.google.com");
		d.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		System.out.println(d.getTitle());  // 4 secs
		System.out.println(d.getCurrentUrl()); // 4 secs
		d.navigate().refresh(); // 4 secs
		d.findElementByLinkText("Images").click();
		
		d.quit();
}
}

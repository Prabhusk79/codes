package seleniumlocator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aimg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Find number of links present in yahoo.com
		
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.yahoo.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		Thread.sleep(3000);
		
		List<WebElement> l=d.findElementsByTagName("a");
		System.out.println("No of links present in the website is:"+l.size());
		Thread.sleep(3000);
		d.quit();
	}

}

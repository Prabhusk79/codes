package seleniumlocator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Atag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Find No of Images Present in bing.com
		
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.bing.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		Thread.sleep(3000);
		
		List<WebElement> i=d.findElementsByTagName("img");
		System.out.println("No of images present in the website is:"+i.size());
		//Thread.sleep(4000);
		d.quit();
		
	}

}

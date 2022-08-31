package seleniumlocator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		
		List<WebElement> i=d.findElementsByTagName("img");
		System.out.println("no of images is:"+i.size());
		
		List<WebElement> i1=d.findElementsByTagName("a");
		System.out.println("no of link test is:"+i1.size());
		
		List<WebElement> i2=d.findElementsByTagName("div");
		System.out.println("no of div tag is:"+i2.size());
		d.quit();
				
		
	}

}

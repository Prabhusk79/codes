package selenium;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("http://www.facebook.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		d.navigate().refresh();
		
		System.out.println("title is:"+d.getTitle());    // getting title of the page
		System.out.println(d.getCurrentUrl());    		 // getting current url
	
		
		//  getting browser details
		
		Capabilities c=d.getCapabilities();
		System.out.println("browser name:"+c.getBrowserName());
		System.out.println("browser version:"+c.getVersion());
		System.out.println("os:"+c.getPlatform());
		
		
		Thread.sleep(5000);
		d.quit();
	}

}

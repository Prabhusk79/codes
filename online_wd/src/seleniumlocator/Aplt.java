package seleniumlocator;

import org.openqa.selenium.chrome.ChromeDriver;

public class Aplt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Click on "Appache poi" in seleniumeasy.com
		
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.seleniumeasy.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		Thread.sleep(5000);
		
		d.findElementByPartialLinkText("Poi").click();
		Thread.sleep(4000);
		d.quit();
		
	}

}

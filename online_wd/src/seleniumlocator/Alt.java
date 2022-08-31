package seleniumlocator;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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

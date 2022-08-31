package seleniumlocator;

import org.openqa.selenium.chrome.ChromeDriver;

public class Axp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		d.findElementByXPath("//*[@type='text']").sendKeys("India");
		d.findElementByXPath("//*[@type='submit']").click();
		Thread.sleep(3000);
		d.quit();
	}

}

package seleniumlocator;

import org.openqa.selenium.chrome.ChromeDriver;

public class L1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("http://www.facebook.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		
		d.findElementById("email").sendKeys("Prabhu sekar");
		d.findElementByName("pass").sendKeys("Prabhu@1993");
		d.findElementByName("login").click();
		//Thread.sleep(5000);
		//d.quit();
		
		
	}

}

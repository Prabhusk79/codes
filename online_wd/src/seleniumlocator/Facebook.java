package seleniumlocator;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.facebook.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		Thread.sleep(5000);
		
		d.findElementByName("email").sendKeys("prabhuskcool@gmail.com");
		Thread.sleep(3000); 
		
		d.findElementById("pass").sendKeys("Prabhu@79");
		Thread.sleep(3000);
		
		d.findElementByName("login").click();
		Thread.sleep(5000);
		d.quit();
		
		
	}

}

package seleniumlocator;

import org.openqa.selenium.chrome.ChromeDriver;

public class Acss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Perform login in mycontactform using css
		
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.mycontactform.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		Thread.sleep(5000);
		
		d.findElementByCssSelector("#user").sendKeys("PrabhuSekar");
		Thread.sleep(4000);
		
		d.findElementByCssSelector("input[type='password']").sendKeys("Prabhu@79");
		Thread.sleep(4000);
		d.findElementByCssSelector("input[value='Login']").click();
		Thread.sleep(4000);
		d.quit();
		
	}

}

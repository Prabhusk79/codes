package seleniumlocator;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

    // Perform Login in mycontactform.com
		
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("http://www.mycontactform.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		
		d.findElementByName("user").sendKeys("PrabhuSekar");
		Thread.sleep(3000);
		d.findElementById("pass").sendKeys("Prabhu@79");
		Thread.sleep(3000);
		d.findElementByName("btnSubmit").click();
		
		Thread.sleep(5000);
		d.quit();
	}

}

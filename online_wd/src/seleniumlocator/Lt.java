package seleniumlocator;

import org.openqa.selenium.chrome.ChromeDriver;

public class Lt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.facebook.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		Thread.sleep(5000);
		
		d.findElementByLinkText("Forgotten password?").click();
		
		//d.findElementByPartialLinkText("How Search").click();
		Thread.sleep(5000);
		d.quit();
	}

		
	}



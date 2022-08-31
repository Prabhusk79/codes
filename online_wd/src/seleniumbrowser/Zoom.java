package seleniumbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Zoom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("http://www.twitter.com");
		d.manage().window().maximize();
		
		// zoom  (normal=100%, zoom in=200%, zoom out= <100)
		
		d.executeScript ("document.body.style.zoom='50%'");
		Thread.sleep(500);
		d.quit();
	}

}

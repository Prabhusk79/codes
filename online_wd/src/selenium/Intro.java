package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("http://www.twitter.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		d.navigate().refresh();
		Thread.sleep(5000);
		d.quit();
	}

}

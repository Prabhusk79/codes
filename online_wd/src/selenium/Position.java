package selenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("http://www.twitter.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		d.navigate().refresh();
		
		// getting Position of the Window
		
		Point pt=d.manage().window().getPosition();
		System.out.println("X value is:"+pt.getX());
		System.out.println("Y value is:"+pt.getY());
		
		Thread.sleep(5000);
		d.quit();
	}

}

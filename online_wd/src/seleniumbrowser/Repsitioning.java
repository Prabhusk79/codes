package seleniumbrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Repsitioning {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("http://www.facebook.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		d.navigate().refresh();
		
		// Repositioning of the window
		
		Point pt=new Point(400,300);
		d.manage().window().setPosition(pt);
		Thread.sleep(6000);
		d.quit();
	}

}

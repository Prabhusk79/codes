package seleniumbrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resizing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("http://www.facebook.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		
		//  Resize of the window
		
		Dimension s=new Dimension(450,720);
		d.manage().window().setSize(s);
		
		Thread.sleep(5000);
		d.quit();
		
	}

}

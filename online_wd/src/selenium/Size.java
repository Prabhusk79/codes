package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("http://www.facebook.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		d.navigate().refresh();
		
		// getting size of the window
		
		Dimension s=d.manage().window().getSize();
		System.out.println("Height is:"+s.getHeight());
		System.out.println("Width is:"+s.getWidth());
		
		Thread.sleep(5000);
		d.quit();
	}

}

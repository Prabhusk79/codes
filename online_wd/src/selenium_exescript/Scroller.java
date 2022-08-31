package selenium_exescript;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scroller {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Method 1  ( scroll page full up and down)
		
	    System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.seleniumeasy.com/");
		Thread.sleep(3000);
		
	    /* d.executeScript("window.scrollBy(0,document.body.scrollHeight)");  // page down
		Thread.sleep(3000);
		
		 d.executeScript("window.scrollBy(0,-document.body.scrollHeight)");  // Page up
		 Thread.sleep(3000);
		 d.quit(); */
		
		// Method 2 (scroll by desired value)
		
		 d.executeScript("window.scrollBy(0,600)");    // scroll down
		 Thread.sleep(3000);
		 d.executeScript("window.scrollBy(0,-500)");   // scroll up
		 Thread.sleep(3000);
		 d.quit();
		 
	}

}

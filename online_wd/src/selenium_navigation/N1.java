package selenium_navigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class N1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.google.com/");
		Thread.sleep(3000);
		
		d.findElementByLinkText("Images").click();
		Thread.sleep(2000);
		
		d.navigate().back();
		Thread.sleep(2000);
		
		d.navigate().forward();
		Thread.sleep(2000);
		d.quit();
	}

}

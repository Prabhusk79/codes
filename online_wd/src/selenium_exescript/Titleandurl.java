package selenium_exescript;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titleandurl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.seleniumeasy.com/");
		Thread.sleep(3000);
		
		System.out.println(d.executeScript("return document.title"));
		System.out.println(d.executeScript("return document.URL"));
		Thread.sleep(3000);
		d.quit();
	}

}

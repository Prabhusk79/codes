package selenium_exescript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.google.com/");
		Thread.sleep(3000);
		
		d.executeScript("alert('TimeOut')");
		Thread.sleep(2000);
		
	Alert a=d.switchTo().alert();
	a.accept();
	Thread.sleep(3000);
	d.quit();
		
	}
		
	}


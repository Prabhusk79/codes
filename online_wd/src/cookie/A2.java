package cookie;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("http://www.google.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		
		// Before Deletion, No of cookies present in google.com
		
		Set<Cookie> p=d.manage().getCookies();
		System.out.println("Number of cookies before deletion is:"+p.size());
		
		// After Deletion, No of cookies present in google.com
		
		d.manage().deleteAllCookies();
		Set<Cookie> p1=d.manage().getCookies();
		System.out.println("Number of cookies after Deletion is:"+p1.size());
		
		Thread.sleep(5000);
		d.quit();
		
	}

}

package cookie;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("http://www.twitter.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		
		Set<Cookie>s=d.manage().getCookies();
		System.out.println("no of cookies before deletion is"+s.size());
		
		d.manage().deleteAllCookies();
		Set<Cookie>s1=d.manage().getCookies();
		System.out.println("no of cookies after deletion is"+s1.size());
		Thread.sleep(500);
		d.quit();
	
	}

}

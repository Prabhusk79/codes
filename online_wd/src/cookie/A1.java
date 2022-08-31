package cookie;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("http://www.bing.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		
		// find no of cookies present in bing.com
		
		Set<Cookie> p=d.manage().getCookies();
		System.out.println("Number of cookies is:"+p.size());
		Thread.sleep(5000);
		d.quit();
		
		for(Cookie x:p)
		{
			System.out.println("Name is:"+x.getName());
			System.out.println("value is:"+x.getDomain());
			System.out.println("Expiry date is:"+x.getExpiry());
			System.out.println("Domain is:"+x.getDomain());
		}
		
		
	}

}

package cookie;


import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;





public class C1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("http://www.facebook.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		
		Set<Cookie>s=d.manage().getCookies();
		System.out.println("no of cookies is"+s.size());
		
		for(Cookie x:s)
		{
			System.out.println("Name is"+x.getName());
			System.out.println("value is"+x.getValue());
			System.out.println("Domain is"+x.getDomain());
		}
		Thread.sleep(5000);
		d.quit();
	}

}

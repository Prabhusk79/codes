package seleniumlocator;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.mycontactform.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		Thread.sleep(3000);
		
		d.findElementByXPath("//*[@name='user']").sendKeys("PrabhuSekar");
		Thread.sleep(3000);
		
		d.findElementByXPath("//input[@type='password']").sendKeys("Prabhu@79");
		Thread.sleep(3000);
		
		d.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();
		Thread.sleep(3000);
		d.quit();
	}

}

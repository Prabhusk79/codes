package seleniumlocator;

import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.mycontactform.com");
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		Thread.sleep(5000);
		
		//d.findElementByCssSelector("input#user").sendKeys("hello");
		//d.findElementByCssSelector("input.txt_log").sendKeys("java");
		//d.findElementByCssSelector("input[type='text']").sendKeys("prabhu");
		//d.findElementByCssSelector("input.txt_log[type='text']").sendKeys("test");
		//d.findElementByCssSelector("input[type^='te']").sendKeys("front");
		//d.findElementByCssSelector("input[type$='xt']").sendKeys("back");
		//d.findElementByCssSelector("input[type*='ex']").sendKeys("substring");
		
		d.findElementByCssSelector("#user").sendKeys("shortcut");
		Thread.sleep(3000);
		d.quit();
	}

}

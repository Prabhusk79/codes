package seleniumlocator;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// login to Gmail
		
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://accounts.google.com");
		
		c.manage().window().maximize();
		Thread.sleep(5000);
		
		c.findElementByName("identifier").sendKeys("prabhuskcool@gmail.com");
		Thread.sleep(4000);
		
		//c.findElementByLinkText("Terms").click();
		c.findElementByCssSelector("#identifierNext > div > button > span").click();
	    Thread.sleep(3000);
		c.quit();
	}

}

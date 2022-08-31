package seleniumkeyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shiftkey {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.google.com");
		Thread.sleep(3000);
		
		/* WebElement ele = d.findElementByName("q");
		Actions a=new Actions(d);
		a.click(ele).keyDown(Keys.SHIFT).sendKeys("india").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		d.quit(); */
		
		// Enter key
		
		WebElement ele = d.findElementByName("q");
		Actions a=new Actions(d);
		a.click(ele).sendKeys("india").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		d.quit();
	}

}
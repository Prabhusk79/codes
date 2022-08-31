package seleniumkeyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ctrltab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.mycontactform.com/");
		Thread.sleep(3000);
		
		WebElement ele = d.findElementByName("user");
		Actions a=new Actions(d);
		a.click(ele).sendKeys("PrabhuSekar").build().perform();
		Thread.sleep(2000);
		
		// Command +a
		a.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
		Thread.sleep(2000);
		
		// Command + c
		a.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).build().perform();
		Thread.sleep(2000);
		
		// tab
		a.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		
		// command v
		a.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();
		Thread.sleep(2000);
		
		// tab
		a.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		
		// enter
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000); 
		
		d.quit();
		
	}

}

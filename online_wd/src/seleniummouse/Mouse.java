package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://mycontactform.com");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement e=d.findElementByName("btnSubmit");
		Actions act=new Actions(d);
		//act.click(e).build().perform();
		//act.doubleClick(e).build().perform();
		//act.contextClick(e).build().perform();
		//act.moveToElement(e).click().build().perform();
		act.clickAndHold(e).build().perform();
		Thread.sleep(3000);
		act.release(e).build().perform();
		
		Thread.sleep(3000);
		d.quit();
	}

}

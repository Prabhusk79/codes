package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://jqueryui.com/resizable/");
		Thread.sleep(3000);
		
		d.switchTo().frame(0);
		Actions a=new Actions(d);
		WebElement ele = d.findElementById("resizable");
		a.dragAndDropBy(ele, 25, 35).build().perform();
		Thread.sleep(3000);
		d.quit();
	}

}

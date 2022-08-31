package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://jqueryui.com/slider/");
		Thread.sleep(3000);
		
		// slider is the example of drag and drop by (only harizantal value)
		
		d.switchTo().frame(0);
		Actions a=new Actions(d);
		WebElement ele = d.findElementById("slider");
		a.dragAndDropBy(ele, 50, 0).build().perform();
		Thread.sleep(3000);
		d.quit();
	}

}

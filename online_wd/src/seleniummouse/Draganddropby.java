package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddropby {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://jqueryui.com/draggable/");
		Thread.sleep(3000);
		
		d.switchTo().frame(0);
		Actions a=new Actions(d);
		WebElement ele = d.findElementById("draggable");
		a.dragAndDropBy(ele, 0, 100).build().perform();
		Thread.sleep(3000);
		d.quit();
	}

}

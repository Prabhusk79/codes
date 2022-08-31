package seleniumbuttons;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://courses.letskodeit.com/practice");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		//d.findElementById("benzcheck").click();  // Method 1: (choose any one of the desired value)
		//Thread.sleep(3000);
		
		// Method 2:(store all the element in list format)
		List<WebElement> cb=d.findElementsByXPath("//*[@name='cars' and @type='checkbox']");  // Method 2
		for(WebElement x:cb)
		{
			if(x.isDisplayed())
			{
				x.click();
				Thread.sleep(3000);
			}
		}
		d.quit();
	}

}

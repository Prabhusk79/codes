package seleniumbuttons;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiob {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://courses.letskodeit.com/practice");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		//d.findElementById("benzradio").click();  // Method 1: click req any one of the option
		//Thread.sleep(3000);
		
		 List<WebElement> rb=d.findElementsByXPath("//*[@name='cars' and @type='radio']");  //Method:2
		//Thread.sleep(3000);
		
		for(WebElement x:rb)
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

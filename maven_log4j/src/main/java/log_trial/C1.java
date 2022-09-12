package log_trial;

import java.util.List;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class C1 {

	
	static Logger log= LogManager.getLogger(C1.class);   // connect log4j to class
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/varun/Downloads/chromedriver");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://courses.letskodeit.com/practice");
		log.info("visited website");  // info
		log.info("going to click an checkboxes");  //info
		List<WebElement> ele = ob.findElementsByXPath("//*[@name='cars' and @type='checkbox']");
		
		log.warn("check box is not visible");    // info
		for(WebElement x: ele)
		{
			if(x.isDisplayed())
			{
			x.click();
			}
		}
		Thread.sleep(3000);
		log.info("clossed");  // info
		ob.quit();
		
	}
  
}

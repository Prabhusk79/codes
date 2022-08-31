package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://courses.letskodeit.com/practice");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement db=d.findElementById("carselect");
		Select s=new Select(db);
		//s.selectByIndex(2);
		//s.selectByValue("benz");
		s.selectByVisibleText("Honda");
		Thread.sleep(3000);
		d.quit();
	}

}

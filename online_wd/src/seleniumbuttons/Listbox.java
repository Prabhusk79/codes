package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://courses.letskodeit.com/practice");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement e=d.findElementById("multiple-select-example");
		Select s=new Select(e);
		s.selectByIndex(0);
		s.selectByValue("orange");
		s.selectByVisibleText("Peach");
		Thread.sleep(4000);
		
		s.deselectByVisibleText("Peach");
		Thread.sleep(3000);
		d.quit();
		
	}

}

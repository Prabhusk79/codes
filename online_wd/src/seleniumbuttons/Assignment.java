package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://courses.letskodeit.com/practice");
		d.manage().window().maximize();
		Thread.sleep(3000);
	}

}

package selenium_exescript;

import org.openqa.selenium.chrome.ChromeDriver;

public class Exe3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.mycontactform.com/");
		Thread.sleep(3000);
		
		d.executeScript("document.getElementById('user').value='Dhivyakarthi123'");
		
		d.executeScript("document.getElementById('pass').value='12345'");

		d.executeScript("document.getElementsByName('btnSubmit')[0].click()");
		Thread.sleep(3000);
		d.quit();
	}

}

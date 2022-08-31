package tng_dataprovide;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Example2 {

	ChromeDriver d;
	@DataProvider(name="prabhu")
	public static Object[][] DataSet(){
		Object[][] obj = {
				{"valid","prabhuskcool@gmail.com","Prabhu@79"},  //both valid
				{"invaliduser","prabhusk","Prabhu@79"},     // un-invalid, pass-valid
				{"invalidpass","prabhuskcool@gmail.com","prabhu123"},  // un-valid, pass-invalid
				{"invalid","prabhu@gmail.com","prabhu@123"}     // both invalid
		};
				
		return obj;
	}
	@Test(dataProvider="prabhu")
	public void datapro(String type,String username,String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/varun/Downloads/chromedriver");
		d=new ChromeDriver();
		
		d.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		d.get("https://www.facebook.com/login/");
		
		// Facebook page log in
		
		d.findElementById("email").sendKeys(username);
		d.findElementById("pass").sendKeys(password);
		d.findElementById("loginbutton").click();
		
		if(type.equals("valid"))
		{
			System.out.println("in home page");
			d.close();
		}
		else {
			System.out.println("invalid user");
			
		Thread.sleep(2000);
		
		d.quit();
		
		}
		
		
	}
}

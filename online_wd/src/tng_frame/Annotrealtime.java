package tng_frame;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotrealtime {
	ChromeDriver d;
	
	@AfterTest
	public void at() throws InterruptedException
	{
		System.out.println("after test:closing site");
		Thread.sleep(3000);
		d.close();
	}
	
	@Test(priority=0)
	public void t1()
	{
		System.out.println("test case1: getting title");
		System.out.println(d.getTitle());
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("after class:get url");
		System.out.println(d.getCurrentUrl());
	}
	
	@BeforeTest
	public void bt()
	{
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
	    d= new ChromeDriver();
		d.get("http://www.mycontactform.com");
		System.out.println("before test:visiting the site");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("after method:delete cookies");
		d.manage().deleteAllCookies();
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("before method:refresh");
		d.navigate().refresh();
	}
	
	@Test(priority=1)
	public void t2()
	{
		System.out.println("test case2:clic on the element");
		d.findElementByLinkText("Help").click();
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("before class:maximize");
		d.manage().window().maximize();
		
	}
}

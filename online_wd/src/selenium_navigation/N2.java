package selenium_navigation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class N2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// navigate to another tabs
		
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http:\\www.google.com");
	    driver.manage().window().maximize();
	    
	    
	 //open seleniumeasy.com in new tab   
	 driver.executeScript("window.open('https://www.seleniumeasy.com','_blank');");
	  
	 //get the control of first tab :    driver.getwindowhandle() => parent 
	 //get the control of both tabs :    driver.getwindowhandles()=> s1={google.com, seleniumeasy.com}
	 
	 String parent=driver.getWindowHandle();// control will be in the parent window //google
	 // collecting all the handle
	  Set<String> s1 = driver.getWindowHandles();// 2(both the tabs = collected)
	    // iterate through the elements present in set
	  
	  Iterator<String> I1 = s1.iterator();  // hasNext , next()

	  // hasnext=> whether content is there
	  // next -> read the content 
	  
	  
	while(I1.hasNext())// whether any content is there 
	    {
	      String child_window=I1.next();
	      if(!parent.equals(child_window))
	    	  { // control is moved to child window 
	        driver.switchTo().window(child_window);
	       driver.findElement(By.linkText("Maven")).click();
	       Thread.sleep(4000);
	        driver.close();
	      }
	      
	      
	   }

	    driver.switchTo().window(parent);//google 
	    System.out.println(driver.switchTo().window(parent).getTitle());// google
	    //driver.findElement(By.linkText("Images")).click();
	    Thread.sleep(5000);
	    driver.findElementByLinkText("Images").click();
	    Thread.sleep(5000);
	    driver.quit();
	}

}

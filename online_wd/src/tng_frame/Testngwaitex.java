package tng_frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Testngwaitex {
      
	// Explicity wait
	
	@Test
	public void exw() throws InterruptedException
	{
	ChromeDriver d;
	System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
    d= new ChromeDriver();
    d.get("https://www.google.com/");
    Thread.sleep(2000);
    d.executeScript("alert('Timeout')");
    Thread.sleep(2000);
  
    WebDriverWait w=new WebDriverWait(d,5);
    
    w.until(ExpectedConditions.titleIs("Google"));  // title of the page
    
    w.until(ExpectedConditions.titleContains("oo")); // if title contains the char='oo' 
    
    w.until(ExpectedConditions.alertIsPresent()); // alert is present or not
    Alert a=d.switchTo().alert();   // alert handle
    a.accept();
    
    w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Images"))); // find element & check its visibility
    
    w.until(ExpectedConditions.elementToBeClickable(By.linkText("Gmail"))); // if element clickable or not

    // check visibility of more elements
    w.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("img")));
    d.quit();

}
}

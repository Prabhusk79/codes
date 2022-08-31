package seleniumbuttons;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Work {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		System.out.println(d.executeScript("return document.title"));
		System.out.println(d.executeScript("return document.URL"));
		Thread.sleep(2000);
		
		WebElement ele = d.findElementById("twotabsearchtextbox");
		Actions s=new Actions(d);
		s.click(ele).sendKeys("mobiles").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		
		
		d.findElementByLinkText("OnePlus").click();
		Thread.sleep(3000); 
		d.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		
		WebElement e1 = d.findElementById("low-price");
		Actions s1=new Actions(d);
		s1.click(e1).sendKeys("25,000").build().perform();
		Thread.sleep(2000);
		s1.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		s1.sendKeys("35000").build().perform();
		s1.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		d.quit();
		
		/*System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement bmi = d.findElementById("height_feet");
		Actions a=new Actions(d);
		a.click(bmi).sendKeys("5.8").build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.TAB).sendKeys("68").build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.TAB).sendKeys("150").build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		d.quit();*/
	}

}

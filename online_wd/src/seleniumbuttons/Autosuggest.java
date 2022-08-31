package seleniumbuttons;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosuggest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
     // code for autosuggestion and selecting
	
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
		d.get("https://jqueryui.com/autocomplete/");
		
		
		d.switchTo().frame(0);
		WebDriverWait wait=new WebDriverWait(d,2);
		WebElement text = d.findElementById("tags");
		text.sendKeys("j");
		 WebElement autoOptions = d.findElement(By.id("ui-id-1"));
		 
		 wait.until(ExpectedConditions.visibilityOf(autoOptions));
		 List<WebElement> optionstoSelect=autoOptions.findElements(By.tagName("li"));
		 for(WebElement option:optionstoSelect)
		 {
			 if(option.getText().equals("Java"))
			 {
				 System.out.println("Trying to select:"+"Java");
				 option.click();
				 break;
			 }
			 
		 }
	
		d.quit();
		
	}

}

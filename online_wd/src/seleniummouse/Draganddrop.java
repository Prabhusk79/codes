package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver" );
		ChromeDriver d= new ChromeDriver();
        d.get("https://jqueryui.com/droppable/");
        Thread.sleep(3000);
		
        // Perform drag and drop
		//webelements=> inside the frame
		// switch your control to that frame
		//id, name, index 
		
		 d.switchTo().frame(0);
		
		Actions ac= new Actions(d);
		
		WebElement ele1 = d.findElementById("draggable");
		
		WebElement ele2 = d.findElementById("droppable");
		
		ac.dragAndDrop(ele1, ele2).build().perform(); 
		Thread.sleep(3000);
		d.quit();
		
	}

}

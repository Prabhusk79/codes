package mavenproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Schreenshot {

	@Test
	public void sc() throws InterruptedException, IOException {
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
		 File f = d.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(f,new File("/Users/varun/eclipse-workspace/maven_work/Schreenshots/b.png"));
		
		Actions ac= new Actions(d);
		
		WebElement ele1 = d.findElementById("draggable");
		
		WebElement ele2 = d.findElementById("droppable");
		
		ac.dragAndDrop(ele1, ele2).build().perform(); 
		File f1 = d.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(f1,new File("/Users/varun/eclipse-workspace/maven_work/Schreenshots/a.png"));
		
		
		Thread.sleep(3000);
		d.quit();
		
	}

}

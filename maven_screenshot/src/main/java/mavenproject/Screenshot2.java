package mavenproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Screenshot2 {
	@Test
    public void photo() throws InterruptedException, IOException
    {
	System.setProperty("webdriver.chrome.driver","/Users/varun/Downloads/chromedriver");
	ChromeDriver d= new ChromeDriver();
    d.get("https://www.amazon.in/");
    Thread.sleep(2000);
    
    WebElement ele = d.findElementById("twotabsearchtextbox");
    ele.sendKeys("Books");
    
    File s = d.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(s,new File("/Users/varun/eclipse-workspace/maven_work/Schreenshots/c.png"));
	
    Thread.sleep(2000);
    }
}

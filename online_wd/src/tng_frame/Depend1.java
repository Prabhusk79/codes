package tng_frame;

import org.testng.annotations.Test;

public class Depend1 {

	@Test(priority=0,groups="1")
	public void visiting()
	{
		System.out.println("visiting the website");
	}
	@Test(priority=1,groups="1",dependsOnMethods="visiting")
	public void lg()
	{
		System.out.println("log in");
	}
	
}

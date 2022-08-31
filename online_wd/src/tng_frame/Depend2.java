package tng_frame;

import org.testng.annotations.Test;

public class Depend2 {
    @Test(priority=0,groups="main")
	public void enterit()
	
	{
		System.out.println("enter user name");
	}
	@Test(priority=1,groups="main")
	public void enterpass()
	{
	System.out.println("enter password");	
	}
	@Test(priority=2,groups="main")
	public void login()
	{
	System.out.println("login");
	}
	@Test(priority=3,dependsOnGroups="main")
	public void home()
	{
		System.out.println("Home");
	}
}

package tng_frame;

import org.testng.annotations.Test;

public class Atribute {

	@Test(priority=0,description="FIRST",groups="1",enabled=false)
	public void m1()
	{
		System.out.println("Test case 1");
	}
	

	@Test(priority=2,description="third",groups="1",invocationCount=2)
	public void m2()
	{
		System.out.println("Test case 3");
	}
	

	@Test(priority=1,description="second",groups="2",timeOut=3000)
	public void abc()
	{
		System.out.println("Test case 2");
	}
}

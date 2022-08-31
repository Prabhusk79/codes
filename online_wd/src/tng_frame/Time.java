package tng_frame;

import org.testng.annotations.Test;

public class Time {

	@Test(timeOut=4000)
	public void timeo() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("testing");
	}
}

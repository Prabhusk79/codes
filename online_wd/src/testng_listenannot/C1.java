package testng_listenannot;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// for connect any class in the project
// @Listeners(packagename.classname.class)- for connect class

public class C1 implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped");
	}

	@Override
	public void onStart(ITestContext context) {
        System.out.println("Test case started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test case finished");
	}

	
	
	
	
}

package testNg;



import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5 {


	
	
	@Test(invocationCount = 5)
	public void test5b()
	{
		
		Reporter.log("Test5b...",true);//code is executed 5 times--> 5 test report 
		
	}
}

package testNg;



import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void testA()
	{
		System.out.println("Test1...");//print only in console
		Reporter.log("Test1*****");//print only  in html report
		Reporter.log("Test1%%%%",false);//print only in html 
		Reporter.log("Test1$$$$",true);//print in html and console
	}

}

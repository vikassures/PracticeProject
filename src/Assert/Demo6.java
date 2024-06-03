package Assert;



import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo6 {

	
	@Test(dependsOnMethods = "getinterview4CV")
	public void prepareCV4interview()
	{
		Reporter.log("prepare cv",true);
	}
	
	@Test(dependsOnGroups = "prepareCV4interview")
	public void getinterview4CV() {
		Reporter.log("get interview",true);
	}
}

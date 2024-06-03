package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(7000);
		
		String expected="dashboard";
		System.out.println("Expected:"+expected);
		
		String actual=driver.getCurrentUrl();
		System.out.println("Actual:"+actual);
		
		if(actual.contains(expected))
		{
			System.out.println("Pass: Home Page is displayed");
		}
		else
		{
			System.err.println("Fail: Home Page is NOT displayed");
		}
		driver.quit();
	}
}

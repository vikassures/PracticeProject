package Actions;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo8 {
//File upload popup->absolute path
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B93%20Selenium/Workspace/pages/sample9.html?");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("A2")).sendKeys("F:/MYCV.docx");
				
		
		
		
		
		
	}

}

package Alert;


import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {
//file download
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B93%20Selenium/Workspace/pages/sample9.html?");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("A3")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("PageLink_5")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("DirectLink_13")).click();
		//write a java code to check if the file (user_datasheet.pdf)is present in downloads folder 
		
		
		
		
		
		
	}

}

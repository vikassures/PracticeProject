package Actions;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {
//right click /context click + alert popup
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions actions=new Actions(driver);
		actions.contextClick(button).perform();
		
		Thread.sleep(1000);
		
		WebElement copy=driver.findElement(By.xpath("//span[text()='Paste']"));
		
		actions.moveToElement(copy).pause(Duration.ofSeconds(2)).click().perform();
		
		//get the msg from alert popup and click ok
		
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		Thread.sleep(1000);
		
		driver.quit();
		
		
	}

}

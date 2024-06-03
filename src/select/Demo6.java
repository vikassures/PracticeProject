package select;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Pages/sample13.html");
		
		WebElement listBox = driver.findElement(By.id("A3"));
		Select select=new Select(listBox);
		
		
		Thread.sleep(1000);
		select.deselectAll();
		
	}

}

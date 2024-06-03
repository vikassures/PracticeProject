package select;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Pages/sample13.html");
		
		WebElement listBox = driver.findElement(By.id("A2"));
		Select select=new Select(listBox);
		System.out.println(select.isMultiple());//true
		
		Thread.sleep(1000);
		select.selectByIndex(0);
		Thread.sleep(1000);
		select.selectByValue("b");
		Thread.sleep(1000);
		select.selectByVisibleText("Snacks");
		
		Thread.sleep(1000);
		select.deselectByIndex(0);
		Thread.sleep(1000);
		select.deselectByValue("b");
		Thread.sleep(1000);
		select.deselectByVisibleText("Snacks");
		
	}

}

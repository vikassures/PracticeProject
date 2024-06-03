package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/SeleniumGit/B93/pages/sample8.html");
		//get the text present in text box --> value present in text box
		String v = driver.findElement(By.id("A1")).getAttribute("value");
		System.out.println(v);
		driver.quit();
		

	}

}

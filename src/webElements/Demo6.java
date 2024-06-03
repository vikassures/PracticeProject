package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/SeleniumGit/B93/pages/sample8.html");
		WebElement element = driver.findElement(By.id("A2"));
		
		String tag = element.getTagName();
		System.out.println(tag);
		
		String url = element.getAttribute("href");
		System.out.println(url);
		
		String text= element.getText();
		System.out.println(text);
		
		driver.quit();
		

	}

}

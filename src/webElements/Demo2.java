package webElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
WebElement e= driver.switchTo().activeElement();
e.sendKeys("Vik");



	}

}

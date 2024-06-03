package webElements;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver= new ChromeDriver();
driver.get("file:///C:/SeleniumGit/B93/pages/sample1.html");
System.out.println(driver.getTitle());
driver.navigate().refresh();
Thread.sleep(1000);
driver.manage().window().maximize();
	}

}

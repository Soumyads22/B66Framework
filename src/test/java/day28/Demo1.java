package day28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void testA()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}
}

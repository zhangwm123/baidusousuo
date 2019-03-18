package jenkinsbaidu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginutil {
	public static WebDriver driver;
	public static String url;
	@BeforeClass
	public static void open() {
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		driver=new ChromeDriver();
		url="https://www.baidu.com/";
		
	}
	@Test
	public void baidu() {
		driver.get(url);
		driver.findElement(By.id("kw")).sendKeys("jenkins");
		driver.findElement(By.id("su")).click();
	}
	@AfterClass
	public void tuichu() {
		//driver.quit();
	}
}

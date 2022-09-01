package qa.cskart.electronics.testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import qa.cskart.electronics.utils.BrowserManager;

public class QA_SanityCheck {
	
	String url="";
	@Test
	public void tc_01_csKart_Search() {
		WebDriver driver = BrowserManager.getDriver("chrome");//calls broswer dependencies from utils
		driver.get(url);
		
		driver.findElement(By.id("search_input")).sendKeys("Laptop");
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		
	}

}

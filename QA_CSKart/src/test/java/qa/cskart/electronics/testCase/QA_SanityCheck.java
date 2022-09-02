package qa.cskart.electronics.testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import qa.cskart.electronics.pageObject.HomePage;
import qa.cskart.electronics.utils.BrowserManager;

public class QA_SanityCheck {
	
	
	@Test
	@Parameters({"browser", "url"})
	public void tc_01_csKart_Search(String browser, String url) {
		WebDriver driver = BrowserManager.getDriver(browser,url);//calls broswer dependencies from utils
		
		//since we are implementing page factory concept we won't create object of page object classes
		HomePage obj = PageFactory.initElements(driver,HomePage.class);
		
		//call business method of homepage and it would invoke all the methods 
		obj.searchAllProduct("Laptop");
		
	}

}

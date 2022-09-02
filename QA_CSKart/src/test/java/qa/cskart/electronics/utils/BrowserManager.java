package qa.cskart.electronics.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class BrowserManager {

	public static WebDriver getDriver(String browserType, String url) {
		WebDriver driver = null;

		// Select the required browser
		if (browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\khitish\\Desktop\\ChromeDriver\\One\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserType.equalsIgnoreCase("firefox")) {
			// driver = new FirefoxDriver();
		} else {
			Assert.assertTrue(false, "Invoke Correct Browser!!");
		}
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
		Reporter.log("Navigated to browser: "+browserType+"\n"+"URL: "+url, true);
		return driver;
	}

}

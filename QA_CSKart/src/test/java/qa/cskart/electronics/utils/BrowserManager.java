package qa.cskart.electronics.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrowserManager {

	public static WebDriver getDriver(String browserType) {
		WebDriver driver = null;

		// Select the required browser
		if (browserType.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserType.equalsIgnoreCase("firefox")) {
			// driver = new FirefoxDriver();
		} else {
			Assert.assertTrue(false, "Invoke Correct Browser!!");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		return driver;
	}

}

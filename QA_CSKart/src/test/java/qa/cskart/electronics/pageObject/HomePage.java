package qa.cskart.electronics.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Layer-1: create objects
	@FindBy(how=How.ID,using = "search_input")
	private WebElement txtbx_Search;
	
	@FindBy(how=How.XPATH,using = "//button[@title='Search']")
	private WebElement btnClick_Search;//locators should be always private
	
	//Layer-2: define methods
	public void setSearchTextBox(String text) {
		txtbx_Search.sendKeys(text);
		Reporter.log("Product entered in search box: "+text, true);
	}
	
	public void clickSearchButton() {
		btnClick_Search.click();
		Reporter.log("Search box button clicked", true);
	}
	
	
	//Layer-3: Businees Methods
	public void searchAllProduct(String text) {
		setSearchTextBox(text);
		clickSearchButton();
		
		//Add assertions to check if the flow is correct
		String actual_Title=driver.getTitle();
		String expected_Title="Catalog :: Search results";
//		System.out.println(actual_Title);
//		System.out.println(expected_Title);
		
		Assert.assertEquals(actual_Title, expected_Title);
		Reporter.log("Searched the product successfully!!", true);

	}

}

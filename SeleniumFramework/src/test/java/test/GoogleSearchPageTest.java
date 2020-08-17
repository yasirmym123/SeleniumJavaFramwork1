package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearchTest();
		
	}
	
	public static void googleSearchTest() {
		System.setProperty("webdriver.gecko.driver", "/Users/yasir/Desktop/SeleniumFramework/drivers/geckodriver/geckodriver");
		 driver = new FirefoxDriver();
		 
		 
		 GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		 
		 driver.get("https://www.google.com/");
		 
		 searchPageObj.setTextInSearchBox("A B C D");
		 
		 searchPageObj.clickSearchButton();
		 
		 driver.close();
		 
		 
	}

}

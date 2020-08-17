package test;


import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest {

	
	private static WebDriver driver = null;
	public static void main(String[] args) {
	googleSearch();

	}
	
	public static void googleSearch() {
		System.setProperty("webdriver.gecko.driver", "/Users/yasir/Desktop/SeleniumFramework/drivers/geckodriver/geckodriver");
		 driver = new FirefoxDriver();
		 
		 // go to google.com
		 
		 driver.get("https://www.google.com/");
		 
		 // enter text in text search textbox
		 
		 // driver.findElement(By.name("q")).sendKeys("Automation Step by step");
		 
		   GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		 // click on search Button
		 //driver.findElement(By.name("btnk")).click();
		 //driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		 GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		 // close browser
		 driver.close();
		 
		 System.out.println("Test Completed Sucessfully");
		 
		 
	}

}

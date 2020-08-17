package test;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNG_Demo {
	
	WebDriver driver = null;
	
	@BeforeTest
	
	public void setUpTest() {
		System.setProperty("webdriver.gecko.driver", "/Users/yasir/Desktop/SeleniumFramework/drivers/geckodriver/geckodriver");
		  driver = new FirefoxDriver();
		
	}

	
	@Test
	public void googleSearch() {
		
		 
		 // go to google.com
		 
		 driver.get("https://www.google.com/");
		 
		 // enter text in text search textbox
		 
		 driver.findElement(By.name("q")).sendKeys("Automation Step by step");
		 
		 // click on search Button
		 //driver.findElement(By.name("btnk")).click();
		 driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		 
		 // close browser

		 
		 
	}
	
	@AfterTest
	public void tearDownTest() {
		 driver.close();
		 driver.quit();
				 
				 System.out.println("Test Completed Sucessfully");
		
	}

}

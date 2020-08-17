package test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
	googleSearch();

	}
	
	public static void googleSearch() {
		System.setProperty("webdriver.gecko.driver", "/Users/yasir/Desktop/SeleniumFramework/drivers/geckodriver/geckodriver");
		 WebDriver driver = new FirefoxDriver();
		 
		 // go to google.com
		 
		 driver.get("https://www.google.com/");
		 
		 // enter text in text search textbox
		 
		 driver.findElement(By.name("q")).sendKeys("Automation Step by step");
		 
		 // click on search Button
		 //driver.findElement(By.name("btnk")).click();
		 driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		 
		 // close browser
		 driver.close();
		 
		 System.out.println("Test Completed Sucessfully");
		 
		 
	}

}

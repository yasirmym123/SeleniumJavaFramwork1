package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {
	
	public static void main(String[] args) {
		seleniumWaits();
		
	}
	
	public static void seleniumWaits() {
		
		 System.setProperty("webdriver.gecko.driver", "/Users/yasir/Desktop/SeleniumFramework/drivers/geckodriver/geckodriver");
		 WebDriver driver = new FirefoxDriver();
		 
		 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get("https://google.com");
		 driver.findElement(By.name("q")).sendKeys("Welcome to Seleinium");
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcdefgh")));
		 
		 driver.findElement(By.name("abcd")).click();
		 
		 driver.close();
		 driver.quit();
	}

}

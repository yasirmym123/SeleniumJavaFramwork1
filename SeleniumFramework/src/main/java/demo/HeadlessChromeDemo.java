package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class HeadlessChromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();

	}
	
	
	public static void test() {
		 System.setProperty("webdriver.gecko.driver", "/Users/yasir/Desktop/SeleniumFramework/drivers/geckodriver/geckodriver");
		 WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.close();
		driver.quit();
		System.out.println("Completed");
		
	}

}

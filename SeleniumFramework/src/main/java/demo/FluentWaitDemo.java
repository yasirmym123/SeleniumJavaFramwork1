package demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {
	
public static void main (String[] args) throws Exception {
	test();
	
}
	
	public static void test() throws Exception {
		
		
		 System.setProperty("webdriver.gecko.driver", "/Users/yasir/Desktop/SeleniumFramework/drivers/geckodriver/geckodriver");
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.get("https://google.com");
		 
		 driver.findElement(By.name("q")).sendKeys("Automation step by step");
		 
		 Thread.sleep(3000);
		 driver.close();
		 driver.quit();
		 
		   // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(5, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.id("foo"));
		     }
		   });
		 
		 
		  
	}

}

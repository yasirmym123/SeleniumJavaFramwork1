package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		
		
		
		ExtentSparkReporter htmlreporter = new ExtentSparkReporter("extentreports.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		ExtentTest test1 = extent.createTest("Google Search Test Omne", "This is a first Test");
		
		System.setProperty("webdriver.gecko.driver", "/Users/yasir/Desktop/SeleniumFramework/drivers/geckodriver/geckodriver");
		 driver = new FirefoxDriver();
		 test1.log(Status.INFO, "starting Test");
		 
		 driver.get("https://www.google.com/");
		 test1.pass("Navigated to google");
		 
		 driver.findElement(By.name("q")).sendKeys("Automation step by step");
		 test1.pass("Entered test in Search Box");
		 driver.close();
		 driver.quit();
		 
		 test1.pass("Closed the Browser");
		 
		 test1.pass("Test Completed");
		 
		 extent.flush();
		 
		 
	}

}

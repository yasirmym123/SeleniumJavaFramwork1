import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		
		System.out.println("projectPath : "+projectPath);
		 System.setProperty("webdriver.gecko.driver", "/Users/yasir/Desktop/SeleniumFramework/drivers/geckodriver/geckodriver");
		 WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "/Users/yasir/Desktop/SeleniumFramework/drivers/chromedriver/chromedriver/");
		
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com/");
		WebElement textBox = driver.findElement(By.xpath("//input[@name='q']"));
		
		textBox.sendKeys("Automation step by step");
		
		
				
				
		driver.close();
	
	}

}

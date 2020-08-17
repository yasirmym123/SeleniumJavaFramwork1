import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.gecko.driver", "/Users/yasir/Desktop/SeleniumFramework/drivers/geckodriver/geckodriver");
		 WebDriver driver = new FirefoxDriver();
		 
		

		 driver.get("https://google.com");
		 driver.findElement(By.name("q")).sendKeys("A B C D");
		 driver.close();
		 driver.quit();
	}

}

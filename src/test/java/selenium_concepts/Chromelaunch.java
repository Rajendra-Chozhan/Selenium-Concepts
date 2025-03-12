package selenium_concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

public class Chromelaunch extends BaseClass{

	
	@Test
	public void methodone() throws IOException  {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://deloittedevelopment.udemy.com/home/my-courses/learning/");
driver.manage().window().maximize();

captureScreen(driver);


driver.quit();

}
	

}

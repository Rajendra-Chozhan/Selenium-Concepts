package selenium_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popup {

	
	@Test
	public  void methodone() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
     String u = "admin";
     // adding username, password with URL
     String str = "https://" + u + ":" + u + "@" +
     "the-internet.herokuapp.com/basic_auth";
     driver.get(str);
     // identify and get text after authentication of popup
     String t = driver.findElement(By.cssSelector("p")).getText();
     System.out.println("Text is: " + t);
     driver.quit();
	
	
}
}
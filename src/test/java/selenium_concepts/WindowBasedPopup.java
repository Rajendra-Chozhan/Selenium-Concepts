package selenium_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowBasedPopup {
@Test
	public void methodone() throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//code to maximize chrome browser
		driver.manage().window().maximize();
		String baseURL = "https://www.rahulshettyacademy.com/AutomationPractice/";
		driver.get(baseURL);

		//Click on alert button and click on accept button using below alert() function.
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(5000);
		//Code to accept the alert pop up
		Alert alert = driver.switchTo().alert();
		alert.accept();


		//Code to close chrome driver.
		driver.close();
		     }

}

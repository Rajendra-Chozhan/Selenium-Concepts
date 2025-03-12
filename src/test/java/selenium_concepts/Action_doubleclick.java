package selenium_concepts;

import java.io.IOException;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_doubleclick extends BaseClass{

	
	@Test
	public void methodone() throws IOException  {

		ChromeOptions handlingSSL = new ChromeOptions();
		//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
		handlingSSL.setAcceptInsecureCerts(true);

		//Creating instance of Chrome driver by passing reference of ChromeOptions object
		WebDriver driver = new ChromeDriver(handlingSSL);

		//WebdriverManager Usage

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgovindraj\\OneDrive - Deloitte (O365D)\\Desktop\\Selenium\\Drivers\\chromedriver-win64\\chromedriver.exe");

		driver.manage().window().maximize();



		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
driver.manage().window().maximize();

captureScreen(driver);


//Double click the button to launch an alertbox
Actions action = new Actions(driver);

WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

action.doubleClick(link).perform();

// we can do scroll action by Actions class also
	//	action.setActiveWheel()

// Know about actions class methods in details e.g setactivewheel

captureScreen(driver);
//Switch to the alert box and click on OK button
Alert alert = driver.switchTo().alert();

System.out.println("Alert Text\n" +alert.getText());

captureScreen(driver);
alert.accept();
//Closing the driver instance

// Study about Alert Methods in detail
driver.quit();

}
	

}

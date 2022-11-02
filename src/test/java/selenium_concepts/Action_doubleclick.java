package selenium_concepts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_doubleclick extends BaseClass{

	
	@Test
	public void methodone() throws IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

driver.get("http://demo.guru99.com/test/simple_context_menu.html");
driver.manage().window().maximize();

captureScreen(driver);


//Double click the button to launch an alertbox
Actions action = new Actions(driver);

WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

action.doubleClick(link).perform();


captureScreen(driver);
//Switch to the alert box and click on OK button
Alert alert = driver.switchTo().alert();

System.out.println("Alert Text\n" +alert.getText());

captureScreen(driver);
alert.accept();
//Closing the driver instance


driver.quit();

}
	

}

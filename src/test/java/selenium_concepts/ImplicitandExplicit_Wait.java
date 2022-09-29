package selenium_concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitandExplicit_Wait {

	
	
	
	@Test
	public void methodone()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
	
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		
		
		// implicit wait		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("rajchozhan024");
		
		//explicitwait
		
		// explicit wait - to wait for the compose button to be click-able
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Next')]")));
		
		WebElement next = driver.findElement(By.xpath("//*[contains(text(),'Next')]"));
		// click on the compose button as soon as the "compose" button is visible
		next.click();
		
		driver.quit();
		
	}
}

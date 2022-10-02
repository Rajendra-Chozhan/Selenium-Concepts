package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HDFC {


	@Test
	public  void methodone() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
    	
		WebElement id = driver.findElement(By.cssSelector(".form-control"));
	id.click();
		id.sendKeys("123456");
		driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]")).click();
		driver.findElement(By.xpath("//input[@id='fldPasswordDispId']")).sendKeys("1252");
		
		
	
	}


}

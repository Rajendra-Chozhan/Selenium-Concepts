package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ismethods {





	@Test
	public void methodone()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

	
	
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		
		
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//*[contains(text(),'Next')]")).isDisplayed();
		
		
		//To print the value
		System.out.println("Element displayed is :"+Display);
		
		
		
		//isEnabled() method returns boolean value either True or False 
		Boolean Enable = driver.findElement(By.xpath("//*[contains(text(),'Next')]")).isEnabled();
		System.out.println("Element enabled is :"+Enable);
		
		
		
		
		//Passing value as "softwaretestingmaterial" in the email field
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("rajchozhan024");
		
		
		
	
		//isSelected() method returns boolean value either True or False
		Boolean Select = driver.findElement(By.xpath("//*[contains(text(),'Next')]")).isSelected();
		System.out.println("Element selected is :"+Select);
		
		//to click on next button
		driver.findElement(By.xpath("//*[contains(text(),'Next')]")).click();
		
		driver.quit();
		}
	}

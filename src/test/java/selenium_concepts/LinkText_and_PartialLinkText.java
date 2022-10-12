package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkText_and_PartialLinkText {

	
	@Test
	public  void methodone() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 String baseUrl = "http://demo.guru99.com/test/link.html";					
	       					
	     			
	        		
	        driver.get(baseUrl);					
	        driver.findElement(By.linkText("click here")).click();					
	        System.out.println("title of page is: " + driver.getTitle());							
	
	        driver.get(baseUrl);		
	        driver.findElement(By.partialLinkText("here")).click();					
	        System.out.println("Title of page is: " + driver.getTitle());		
		
	        driver.quit();
	}
}

package selenium_concepts;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {

	
	@Test
	public  void methodone() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");  
	    driver.manage().window().maximize();
	    int size = driver.findElements(By.tagName("iframe")).size();
	    System.out.println(size);

	    
		//Switch by Index
		driver.switchTo().frame(0);
		//Switch by frame name
			//	driver.switchTo().frame("__tcfapiLocator");
				
				driver.switchTo().defaultContent();
				//
	
	
	    driver.quit();
	        }
}

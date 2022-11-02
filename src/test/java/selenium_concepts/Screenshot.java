
package selenium_concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Screenshot {

	
	

	@Test
	public  void methodone() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 //navigate to url
	    driver.get("http://greenstech.in/selenium-course-content.html");
	
	driver.manage().window().maximize();
	

	
	 WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Core Java Test papers')]"));
     
     
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	        
		
    
   //Take the screenshot
    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    
    //Copy the file to a location and use try catch block to handle exception
    try {
        FileUtils.copyFile(screenshot, new File("C:\\Users\\msi\\Desktop\\homePageScreenshot.png"));
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    
    //closing the webdriver
    driver.close();
}
}

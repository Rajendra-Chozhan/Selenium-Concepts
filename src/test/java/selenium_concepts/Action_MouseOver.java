package selenium_concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_MouseOver {

	
	@Test
	public  void methodone() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgovindraj\\OneDrive - Deloitte (O365D)\\Desktop\\Selenium\\Drivers\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();

		// Add argument to ignore certificate errors
		options.addArguments("--ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://demoqa.com/menu/");
        System.out.println("demoqa webpage Displayed");
        
    	//Maximise browser window
	 driver.manage().window().maximize();
	    
	//Adding wait 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                
        //Instantiate Action Class        
        Actions actions = new Actions(driver);

        //Retrieve WebElement 'Music' to perform mouse hover 
    	WebElement menuOption = driver.findElement(By.xpath("//div[contains(text(),'Elements')]"));

		//performing mousehover with moveToElement
    	actions.moveToElement(menuOption).perform();
    	menuOption.click();
    	System.out.println("Done Mouse hover on 'Music' from Menu");

    	WebElement subMenuOption = driver.findElement(By.xpath("//*[contains(text(),'Text Box')]")); 

    	actions.moveToElement(subMenuOption).perform();
    	subMenuOption.click();
    	
    	System.out.println("Done Mouse hover on 'Rock' from Menu");

        // Close the main window 
    	driver.quit();
 }
 
}

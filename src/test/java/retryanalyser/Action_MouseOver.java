package retryanalyser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Action_MouseOver {

	static WebDriver driver;
	
	@Test(retryAnalyzer = retryanalyser.RetryAnalyzer.class)
	public  void methodone() throws InterruptedException {
		// TODO Auto-generated method stub
try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://www.google.com/");
        System.out.println("demoqa webpage Displayed");
        
    	//Maximise browser window
	 driver.manage().window().maximize();
	    
	//Adding wait 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                
        //Instantiate Action Class        
        Actions actions = new Actions(driver);
        //Retrieve WebElement 'Music' to perform mouse hover 
    	WebElement menuOption = driver.findElement(By.xpath("//div[contains(text(),'Elements')]"));
 
    	actions.moveToElement(menuOption).perform();
    	menuOption.click();
    	System.out.println("Done Mouse hover on 'Music' from Menu");

    	WebElement subMenuOption = driver.findElement(By.xpath("//[contains(text(),'Text Box')]")); 

    	actions.moveToElement(subMenuOption).perform();
    	subMenuOption.click();
    	
    	System.out.println("Done Mouse hover on 'Rock' from Menu");
}
catch (Exception e) {
	System.out.println("Exception occured" );
	
}
	
}


 
}

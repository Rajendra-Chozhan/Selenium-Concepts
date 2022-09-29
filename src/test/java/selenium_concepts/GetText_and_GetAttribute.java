package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetText_and_GetAttribute {

	
	
	@Test
	public  void methodone() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
    	
    	
    	//Storing the text of the heading in a string
    	
    	WebElement heading = driver.findElement(By.xpath("//*[@class='cls-1']"));
    	
 
    	
    	String gettext = driver.findElement(By.xpath("//*[@class='cls-1']")).getText();
    	
    	System.out.println(gettext);
    	
    	
    	String attribute = heading.getAttribute("x");
    	
    	System.out.println(attribute);
    	
    
    	driver.quit();
	}
}

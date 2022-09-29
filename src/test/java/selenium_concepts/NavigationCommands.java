package selenium_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommands {

	
	@Test
	public  void methodone() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		 // Using navigate to command navigate to another url
	     driver.navigate().to("https://stqatools.com/");   
	     driver.manage().window().maximize();
	    	
	 
	     // Using Back command navigate to back page
	     driver.navigate().back();                       
	 
	     // Using Forward command navigate to forward page
	     driver.navigate().forward();                                                                       
	 
	     // Using Refresh command Refresh current page
	     driver.navigate().refresh();

		// Close browser
		driver.close();
	}
}

package selenium_concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_Tabs {

	@Test
	public void methodone()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        // Open new child window within the main window
        driver.findElement(By.id("tabButton")).click();

        //Get handles of the windows
        String parent = driver.getWindowHandle();
        
        System.out.println("The Parent window is" +parent);
        
        Set<String> allwindows = driver.getWindowHandles();
        
       ArrayList<String> tabs = new ArrayList<String>(allwindows);
       
       
      driver.switchTo().window(tabs.get(1));
      
      driver.close();
      
      driver.switchTo().window(tabs.get(0));

	
	driver.close();
	
	
	
	}}

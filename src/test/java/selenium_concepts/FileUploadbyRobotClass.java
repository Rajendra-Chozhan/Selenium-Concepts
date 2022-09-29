package selenium_concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadbyRobotClass {

	
	@Test
	
	public void fileupload()throws AWTException  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://my.monsterindia.com/create_account.html");
		 driver.manage().window().maximize();
	  
	 

		     driver.findElement(By.xpath("//span[contains(text(),'Choose CV')]")).click();
		     
		     StringSelection ss = new StringSelection("C:\\Users\\msi\\Desktop\\Sample.txt");
		     
		     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		     
		     
		      // Robot object creation
		      Robot r = new Robot();
		      //pressing enter
		      r.keyPress(KeyEvent.VK_ENTER);
		      //releasing enter
		      r.keyRelease(KeyEvent.VK_ENTER);
		      //pressing ctrl+v
		      r.keyPress(KeyEvent.VK_CONTROL);
		      r.keyPress(KeyEvent.VK_V);
		      //releasing ctrl+v
		      r.keyRelease(KeyEvent.VK_CONTROL);
		      r.keyRelease(KeyEvent.VK_V);
		      //pressing enter
		      r.keyPress(KeyEvent.VK_ENTER);
		      //releasing enter
		      r.keyRelease(KeyEvent.VK_ENTER);
		      
		   }
}

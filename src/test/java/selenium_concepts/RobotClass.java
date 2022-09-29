package selenium_concepts;

import java.awt.AWTException;
import java.awt.Robot;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RobotClass {

	 @Test	
		public  void robot() throws AWTException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
		 driver.get("http://www.edureka.co");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("Courses")).click();
		 
		 
		 Robot robot = new Robot();
		 
		 Thread.sleep(4000);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(4000);
		 robot.keyPress(KeyEvent.VK_TAB);		
		 Thread.sleep(4000);
		 System.out.println("done");
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(4000);
		 System.out.println("done");
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(4000);
		 System.out.println("done");
		 robot.mouseMove(30,100);
		 Thread.sleep(4000);
		 System.out.println("done");
		 driver.quit();

	 }
}

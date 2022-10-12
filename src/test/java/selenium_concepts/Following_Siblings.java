package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Following_Siblings {

	
		@Test
		public  void methodone() {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.cricbuzz.com/"); 
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			
		WebElement series= 	driver.findElement(By.xpath("//*[contains(text(),'Live Scores')]/following-sibling::div/a[contains(text(),'Series')]"));
		
		series.getText();
		
		driver.quit();
			
		
	}

}

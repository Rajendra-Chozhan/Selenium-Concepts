package selenium_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Equals {

	
	@Test
	public  void methodone() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.browserstack.com/");
		String ActualTitle = driver.getTitle();
		driver.manage().window().maximize();
		System.out.println(ActualTitle);
		String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
			
			
			
			try {
			    Assert.assertEquals(ExpectedTitle, ActualTitle);
			} catch (AssertionError e) {
			    System.out.println("Not equal");
			    throw e;
			}
			System.out.println("Equal");
			driver.close();
		}
	

}

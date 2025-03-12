package selenium_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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

		SoftAssert s = new SoftAssert();
		s.assertEquals(ExpectedTitle,ActualTitle);
		s.assertAll();

		//assertAll will print the assert errors while executing
			
			
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

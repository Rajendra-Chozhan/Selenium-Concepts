package selenium_concepts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Parallel_Browser_Testing {

	
	
	 WebDriver driver = null;

	@Test()
	public void testOnChromeWithBrowserStackUrl()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.browserstack.com/");
	driver.manage().window().maximize();
	System.out.println("this is the test related to chrome browserstack homepage"+ " " +Thread.currentThread().getId());
driver.close();
	}

	@Test()
	public void testOnFirefox()
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\msi\\Desktop\\Selenium\\FireFoxDriver\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.browserstack.com/users/sign_up");
	driver.manage().window().maximize();
	driver.findElement(By.id("user_full_name")).sendKeys("<name>");
	driver.findElement(By.id("user_email_login")).sendKeys("<login email id>");
	driver.findElement(By.id("user_password")).sendKeys("<password>");
	System.out.println("this is the test related to chrome browserstack login"+ " " +Thread.currentThread().getId());
	driver.close();
	}

	
	@Test()
	public void testOnEdge()
	{
		// Set the driver path
		System.setProperty("webdriver.edge.driver", "C:\\Users\\msi\\Desktop\\Selenium\\MicrosoftEdgeDriver\\msedgedriver.exe");

		// Start Edge Session
		WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.browserstack.com/users/sign_up");
	driver.manage().window().maximize();
	driver.findElement(By.id("user_full_name")).sendKeys("<name>");
	driver.findElement(By.id("user_email_login")).sendKeys("<login email id>");
	driver.findElement(By.id("user_password")).sendKeys("<password>");
	System.out.println("this is the test related to chrome browserstack login"+ " " +Thread.currentThread().getId());
	driver.close();
	}
	
}

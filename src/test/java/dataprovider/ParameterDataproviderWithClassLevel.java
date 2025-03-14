package dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParameterDataproviderWithClassLevel {


// we need to check whether this method can be simplified
	   
    @Test(dataProvider="SearchProvider",dataProviderClass=DataproviderClass.class)
    public void testMethod(String author,String searchKey) throws InterruptedException{
    	
    	
	 		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://google.com");
	        driver.manage().window().maximize();
	    
	        
	        WebElement searchText = driver.findElement(By.name("q"));
	        //Search text in google text box
	        searchText.sendKeys(searchKey);
	        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
	        Thread.sleep(3000);
	        //get text from search box
	        String testValue = searchText.getAttribute("value");
	        System.out.println(testValue +"::::"+searchKey);
	        searchText.clear();
	        //verify if search box has correct value
	        Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
	        driver.quit();

			// same scenario should be executed for different users

	   }
}

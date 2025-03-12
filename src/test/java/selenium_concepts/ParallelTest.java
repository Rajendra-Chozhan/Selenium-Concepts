package selenium_concepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ParallelTest
{
    public WebDriver driver;
    @Test
    public void EdgeTest() {

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.browserstack.com/");
        Assert.assertEquals(driver.getTitle(), "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        driver.quit();
    }

    @Test
    public void ChromeTest()
    {
        driver= new ChromeDriver();
        driver.get("https://www.browserstack.com/");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(), "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        driver.quit();
    }


    @Test
    public void IETest()
    {
        driver= new InternetExplorerDriver();
        driver.get("https://www.browserstack.com/");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(), "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        driver.quit();
    }
}

package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Highlight_Element {
	
	
	
	public static void highLighterMethod(WebDriver driver, WebElement element){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');", element);
	}

	@Test
	public  void methodone() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		WebElement ele = driver.findElement(By.xpath("//*[@name='q']"));
		
        //Call the highlighterMethod and pass webdriver and WebElement which you want to highlight as arguments.
highLighterMethod(driver,ele);
Thread.sleep(3500);
ele.sendKeys("SoftwareTestingMaterial.com");
driver.quit();	
		
	}

}




package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollBy {

	@Test
	public  void methodone() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/menu/");
		
		//to perform Scroll on application using Selenium
		// scrolling can be achieved with help of action class

		//Double click the button to launch an alertbox
		Actions action = new Actions(driver);

		WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		action.doubleClick(link).perform();

		
        
   WebElement inter = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/span[1]/div[1]/div[1]"));
         
        
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inter);
		//if you want to scroll horizontally we can using the below method
		// js.executeScript("document.querySelector(inter).scrollLeft=1000");

		//action.scrollByAmount(233,600);
		//action.scrollToElement(inter);


		// scroll from origin example

//		WebElement footer = driver.findElement(By.tagName("footer"));

		//scroll from origin with element

//		WebElement iframe = driver.findElement(By.tagName("iframe"));
//		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(iframe);
//		new Actions(driver)
//				.scrollFromOrigin(scrollOrigin, 0, 200)
//				.perform();

		// with offset
//		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(footer, 0, -50);
//		new Actions(driver)
//				.scrollFromOrigin(scrollOrigin,0, 200)
//				.perform();
	}}





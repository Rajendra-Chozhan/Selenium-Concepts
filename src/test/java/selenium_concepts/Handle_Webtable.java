package selenium_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Handle_Webtable {

	
	@Test
	public  void methodone() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("http://seleniumpractise.blogspot.com/");
		driver.manage().window().maximize();
    	
		WebElement table = driver.findElement(By.id("customers"));
		
		table.isDisplayed();
		
		// xpath for all rows
		
		List<WebElement> allheaders = driver.findElements(By.xpath("//table[@id='customers']//th"));
		
		System.out.println("Total Number of Columns are" + allheaders.size());
		Assert.assertEquals(allheaders.size(), 5, "Column is not same");	
		
		boolean status = false;
		for (WebElement ele:allheaders) 
		
		{
			
		String value=ele.getText();	
			
			System.out.println(value);
			if(value.contains("Country")) {
				
				status =true;
			break;
				
		}}
		
		Assert.assertTrue(status);
		
		
List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		System.out.println("Total no of rows is "+ allrows.size());
		Assert.assertEquals(allrows.size(), 7, "Rows is not same");	
			for (WebElement ele:allrows)
			{
				
				String value=ele.getText();	
					
					System.out.println(value);
				
			}
			
			
			
			List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='customers']//td"));
			
			boolean datastatus = false;
			
				for (WebElement ele:alldata)
				{
					
					String value=ele.getText();	
						
						System.out.println(value);
						
						if(value.contains("Java")) {
							
							datastatus =true;
						break;
							
					}
					
				}
				
				Assert.assertEquals(alldata.size(), 30, "data is not same");	
		driver.quit();
		}
	
}

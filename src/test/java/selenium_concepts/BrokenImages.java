package selenium_concepts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class BrokenImages {

	private int validImageCount=1;
	

	@Test
	public  void methodone() throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/broken_images");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[contains(text(),'Broken Images')]")).click();
		List<WebElement> imageElements = driver.findElements(By.cssSelector("div.example img"));
		for(WebElement image:imageElements) {
		validateImage(image);			
		}
		
		System.out.println("No. of broken images are : "+validImageCount);
	driver.quit();
}
	

private void validateImage(WebElement image) throws ClientProtocolException, IOException {
		
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet getRequest = new HttpGet(image.getAttribute("src"));
		HttpResponse response = client.execute(getRequest);
		if(response.getStatusLine().getStatusCode()==200) {
			validImageCount++;
		}}}

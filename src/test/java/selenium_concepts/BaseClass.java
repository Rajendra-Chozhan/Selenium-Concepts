package selenium_concepts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {

	public static WebDriver driver;
	

	public void captureScreen(WebDriver driver) throws IOException {
		
		 {
			 
		        Date d = new Date();
		        System.out.println(d.toString());

		        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");         // Your each screenshot will be taken as this format "Year-Month-Date-Hours-Minutes-Seconds"
		    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		        FileUtils.copyFile(scrFile,  new File("C:\\Users\\msi\\Automation_Projects\\Selenium_Concepts\\test-output\\Screenshots\\"+sdf.format(d) +".png"));      //your screenshot path and convert date string to SimpleDateFormat because windows can't capture screenshot with(:)
		    }

}
}
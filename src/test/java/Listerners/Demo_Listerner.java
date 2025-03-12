package Listerners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

@Listeners(Listerners.ITestListener.class)
public class Demo_Listerner  {

    //Listeners are not applicable to methods
    //retryanalyser applicable to methods

    public  void methodone() throws InterruptedException {
        // TODO Auto-generated method stub
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\msi\\Desktop\\Selenium\\Chrome Driver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

        } catch (Exception e) {
            System.out.println("Exception occured");

        }

    }    }

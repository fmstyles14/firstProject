package StepDefitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by OHLAR on 7/22/2017.
 */
public class Hooks {

   public static WebDriver driver = null;


    @Before
    public WebDriver setup(){
        //System.setProperty("webdriver.chorome.driver","F:\\SeleniumJars\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","F:\\SeleniumJars\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
        return  driver;


    }
    @After
    public  void tearDown(){
        driver.quit();
    }

}

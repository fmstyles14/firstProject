package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by OHLAR on 7/23/2017.
 */
public class HomePage {

    WebDriver driver=null;

    public HomePage (WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='getting-started']/p[1]")private WebElement hmpgtext;



    public boolean isLoggedIn(String text){
       /* hmpgtext.isDisplayed();]
        return true;*/

        hmpgtext.getText().equals(text);
                return true;
    }

}

package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by OHLAR on 7/22/2017.
 */
public class LoginPage {
    WebDriver driver=null;

    public LoginPage (WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="email" )private WebElement username;
    @FindBy(id= "password") private WebElement passwd;
    @FindBy(name ="commit") private WebElement LoginBtn;
    @FindBy(xpath = "//*[text()='There was a problem with your login.']")private  WebElement errMssg;


    public void loginDetails(String usname, String pwd){
        username.sendKeys(usname);
        passwd.sendKeys(pwd);

    }

    public void clickLogin(){
        LoginBtn.click();
    }

    public void isNotLoggedIn(){
        Assert.assertTrue(errMssg.isDisplayed());



    }

}

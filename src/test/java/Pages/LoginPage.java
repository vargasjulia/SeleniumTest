package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    @FindBy( xpath = "//input[@id='username']")
    public WebElement usernamebox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordbox;

    @FindBy(xpath = "//*[@class='fa fa-2x fa-sign-in']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='subheader']")
    public WebElement loginMessage;

    @FindBy(xpath = "//*[@class='icon-2x icon-signout']")
    public  WebElement logOutButton;

    @FindBy (xpath ="//*[@class='flash error']")
    public WebElement errorMessage;

public LoginPage(){
    PageFactory.initElements( driver,this);
}
}

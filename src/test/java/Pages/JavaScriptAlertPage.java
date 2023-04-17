package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class JavaScriptAlertPage extends CommonMethods {

    @FindBy (xpath = "//*[@id=\"content\"]/div/ul/li[1]/button")
    public WebElement jsAlertButton;

    @FindBy(xpath = "//*[@id=\"result\"]")
    public WebElement alertMessage;

    @FindBy (xpath = "//*[@id=\"content\"]/div/ul/li[2]/button")
    public WebElement jsConfirmButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[3]/button")
    public WebElement jsPromptButton;

    public JavaScriptAlertPage(){
        PageFactory.initElements( driver, this);
    }
}

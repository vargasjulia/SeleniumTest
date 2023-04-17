package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DynamicallyLoadedPage extends CommonMethods {
    @FindBy(xpath = "//*[@id=\"start\"]/button")
    public WebElement startButton;

    @FindBy(xpath = "//*[@id=\"finish\"]/h4")
    public WebElement helloMessage;

    public DynamicallyLoadedPage(){
        PageFactory.initElements( driver,this);
    }

}

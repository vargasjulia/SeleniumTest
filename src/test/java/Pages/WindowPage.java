package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class WindowPage extends CommonMethods {
    @FindBy( xpath = "//*[@id=\"content\"]/div/a")
    public WebElement ClickButton;

    @FindBy(xpath = "/html/body/div/h3")
    public WebElement NewMessage;

    public WindowPage(){
        PageFactory.initElements(driver, this);
    }
}

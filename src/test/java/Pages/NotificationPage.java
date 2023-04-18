package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class NotificationPage extends CommonMethods {
    @FindBy (xpath = "//*[@id=\"content\"]/div/p/a")
    public WebElement here;

    @FindBy (xpath = "//*[@id=\"flash\"]")
    public WebElement message;

    public NotificationPage(){
        PageFactory.initElements(driver, this);
    }
}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class FloatingMenuPage extends CommonMethods {
    @FindBy(xpath = "//*[@id=\"menu\"]")
    public WebElement menu;

    public FloatingMenuPage(){
        PageFactory.initElements(driver, this);
    }
}

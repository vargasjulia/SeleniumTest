package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ContexMenuPage extends CommonMethods {
    @FindBy(xpath = "//*[@id='hot-spot']")
    public WebElement Box;

    public ContexMenuPage(){
        PageFactory.initElements( driver,this);
    }
}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DynamicContentPage extends CommonMethods {
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]")
    public WebElement Text1;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]")
    public WebElement Text2;

    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[2]")
    public WebElement Text3;

    public DynamicContentPage(){
        PageFactory.initElements(driver, this);
    }

}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DynamicControlsPage extends CommonMethods {
    @FindBy(xpath = "//input[@id='checkbox']")
    public WebElement checkBox;
@FindBy(xpath = "//*[@id=\"checkbox-example\"]/button")
    public WebElement RemoveAddButton;
@FindBy(xpath = "//*[@id=\"checkbox\"]/text()")
public WebElement CheckBoxText;
@FindBy(xpath = "//*[@id=\"message\"]")
    public WebElement RemoveMessage;
@FindBy(xpath = "//*[@id=\"input-example\"]/button")
    public WebElement EnableDisableButton;
@FindBy(xpath = "//*[@id=\"message\"]")
    public WebElement EnableMessage;

public DynamicControlsPage(){
    PageFactory.initElements(driver, this);
}


}

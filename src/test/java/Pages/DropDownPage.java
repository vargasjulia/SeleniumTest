package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DropDownPage extends CommonMethods {

    @FindBy(xpath = "//*[@id='dropdown']")
    public WebElement dropdownList;

    public DropDownPage(){
        PageFactory.initElements(driver, this);
    }

}

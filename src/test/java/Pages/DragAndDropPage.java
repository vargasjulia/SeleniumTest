package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DragAndDropPage extends CommonMethods {

    @FindBy(xpath = "//*[@id=\"column-a\"]")
    public WebElement BoxA;

    @FindBy(xpath = "//*[@id=\"column-b\"]")
    public WebElement BoxB;

    public DragAndDropPage(){
        PageFactory.initElements(driver, this);
    }
}

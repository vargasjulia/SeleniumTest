package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class IframePage extends CommonMethods {

    @FindBy(xpath = "//*[@id=\"tinymce\"]")
    public WebElement textBox;

    @FindBy(xpath = "//*[@id=\"mce_0_ifr\"]")
    public WebElement frame;

    public IframePage(){
        PageFactory.initElements(driver, this);
    }
}

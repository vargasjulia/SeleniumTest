package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class HoversPage extends CommonMethods {

    @FindBy (xpath = "//*[@id=\"content\"]/div/div[1]/img")
    public WebElement user1Image;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/h5")
    public WebElement user1Text;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/img")
    public WebElement user2Image;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div[3]/img")
    public WebElement user3Image;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/h5")
    public WebElement user2Text;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/h5")
    public WebElement user3Text;

    public HoversPage(){
        PageFactory.initElements( driver, this);
    }
}

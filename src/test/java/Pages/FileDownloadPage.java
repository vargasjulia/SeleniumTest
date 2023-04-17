package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class FileDownloadPage extends CommonMethods {

    @FindBy(xpath = "//*[@id=\"content\"]/div/a")
    public WebElement file;

    public FileDownloadPage(){
        PageFactory.initElements(driver,this);
    }
}

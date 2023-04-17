package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class FileUploadPage extends CommonMethods {
    @FindBy(xpath = "//*[@id=\"drag-drop-upload\"]")
    public WebElement BoxToUpload;

    public WebElement getBoxToUpload() {
        getBoxToUpload().sendKeys("C:\\Users\\gomez\\OneDrive\\Desktop\\Book1.xlsx");
        return BoxToUpload;
    }
    @FindBy(xpath = "//*[@id=\"drag-drop-upload\"]/div/div[2]")
    public WebElement CheckMark;

    public FileUploadPage(){
        PageFactory.initElements( driver,this);
    }
}

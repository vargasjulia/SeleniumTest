package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class CheckBoxPage extends CommonMethods {

    @FindBy (xpath ="//*[@id=\"checkboxes\"]/input[1]" )
    public WebElement checkBox1;

    @FindBy (xpath ="//*[@id=\"checkboxes\"]/input[2]" )
    public WebElement checkBox2;

    public CheckBoxPage(){
        PageFactory.initElements(driver, this);
    }

}

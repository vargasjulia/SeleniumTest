package test;

import Pages.CheckBoxPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class CheckBoxPageTest extends CommonMethods{

    @BeforeMethod
    public void preCondition(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:7080/checkboxes");
        driver.manage().window().maximize();

    }

    @Test
    public void hoversTest(){

        CheckBoxPage checkBoxPage= new CheckBoxPage();

        List<WebElement> list= (List<WebElement>) checkBoxPage.checkBox1;
       Boolean  is_selected=list.get(0).isSelected();
        if(is_selected){
            list.get(1).click();
        }else {
            list.get(0).click();
        }

    }

    @AfterMethod
    public void PostCond(){CommonMethods.tearDown();}
}

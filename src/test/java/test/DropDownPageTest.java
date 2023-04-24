package test;

import Pages.DropDownPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;



public class DropDownPageTest extends CommonMethods{

    @BeforeMethod
    public void preCondition(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:7080/dropdown");
        driver.manage().window().maximize();

    }

    @Test
    public void dropDownTest(){
        DropDownPage dropDownPage=new DropDownPage();
        Select obj=new Select(dropDownPage.dropdownList);
        obj.selectByIndex(1);
        Assert.assertEquals("Option 1",obj.getAllSelectedOptions());
        obj.selectByIndex(2);
        Assert.assertEquals("Option 2",obj.getAllSelectedOptions());
    }

    @AfterMethod
    public void post(){
        CommonMethods.tearDown();
    }
}


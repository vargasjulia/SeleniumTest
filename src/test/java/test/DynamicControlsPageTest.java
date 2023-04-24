package test;

import Pages.DynamicControlsPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;



public class DynamicControlsPageTest extends CommonMethods{


    @BeforeMethod
    public void preCondition(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:7080/dynamic_controls");
        driver.manage().window().maximize();

    }

    @Test
    public void dynamicControlsTest(){
        DynamicControlsPage dynamicControlsPage= new DynamicControlsPage();
        dynamicControlsPage.checkBox.click();
        dynamicControlsPage.RemoveAddButton.click();
        WebElement webdriverwait= new WebDriverWait((WebDriver) driver, 10)
                .until(ExpectedConditions.visibilityOf(dynamicControlsPage.RemoveMessage));
        dynamicControlsPage.RemoveAddButton.click();
        Assert.assertTrue(dynamicControlsPage.RemoveMessage.isDisplayed());
        dynamicControlsPage.EnableDisableButton.click();

        WebElement webdriverwait1= new WebDriverWait((WebDriver) driver, 10)
                .until(ExpectedConditions.visibilityOf(dynamicControlsPage.EnableMessage));
        Assert.assertTrue(dynamicControlsPage.EnableMessage.isDisplayed());
        dynamicControlsPage.EnableDisableButton.click();

        WebElement webdriverwait2= new WebDriverWait((WebDriver) driver, 10)
                .until(ExpectedConditions.visibilityOf(dynamicControlsPage.EnableMessage));
        Assert.assertTrue(dynamicControlsPage.EnableMessage.isDisplayed());


    }

    @AfterMethod
    public void post(){
        CommonMethods.tearDown();
    }
}

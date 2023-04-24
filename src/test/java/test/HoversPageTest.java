package test;

import Pages.HoversPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;



public class HoversPageTest extends CommonMethods{

    @BeforeMethod
    public void preCondition(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:7080/hovers");
        driver.manage().window().maximize();

    }

    @Test
    public void hoversTest(){
        HoversPage hoversPage=new HoversPage();

        Actions action=new Actions((WebDriver) driver);
        action.moveToElement(hoversPage.user1Image).perform();
        Assert.assertTrue(hoversPage.user1Text.isDisplayed());
        action.moveToElement(hoversPage.user2Image).perform();
        Assert.assertTrue(hoversPage.user2Text.isDisplayed());
        action.moveToElement(hoversPage.user3Image).perform();
        Assert.assertTrue(hoversPage.user3Text.isDisplayed());


    }

    @AfterMethod
    public void postCondition(){
        CommonMethods.tearDown();
    }

}
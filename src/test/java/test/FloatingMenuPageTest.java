package test;

import Pages.FloatingMenuPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;



public class FloatingMenuPageTest extends CommonMethods {



    @BeforeMethod
    public void preCondition(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:7080/floating_menu ");
        driver.manage().window().maximize();

    }

    @Test
    public void floatingMenuTest(){
        FloatingMenuPage floatingMenuPage = new FloatingMenuPage();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,150)");

        Assert.assertTrue(floatingMenuPage.menu.isDisplayed());

    }

    @AfterMethod
    public void post(){
        CommonMethods.tearDown();
    }
}

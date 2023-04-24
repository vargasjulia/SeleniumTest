package test;

import Pages.WindowPage;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;


public class WindowPageTest extends CommonMethods {


    @BeforeMethod
    public void preCondition(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:7080/windows");
        driver.manage().window().maximize();

    }

    @Test

public void windowTest() {
        WindowPage windowPage = new WindowPage();
        windowPage.ClickButton.click();
        String handle = driver.getWindowHandle();
        driver.switchTo().window(handle);
        Assert.assertTrue(windowPage.NewMessage.isDisplayed());


    }

    @AfterMethod
    public void post(){
        CommonMethods.tearDown();


            }
        }



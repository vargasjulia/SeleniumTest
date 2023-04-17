package test;

import Pages.DynamicallyLoadedPage;
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



public class DynamicallyLoadedPageTest {
    public static WebDriver driver;
    @BeforeMethod
    public void preCondition(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:7080/dynamic_loading/2 ");
        driver.manage().window().maximize();

    }

    @Test
    public void dynamicallLoadTest(){
        DynamicallyLoadedPage dynamicallyLoadedPage=new DynamicallyLoadedPage();
        dynamicallyLoadedPage.startButton.click();
        WebElement webdriverwait= new WebDriverWait((WebDriver) driver, 10)
                .until(ExpectedConditions.visibilityOf(dynamicallyLoadedPage.helloMessage));
        Assert.assertTrue(dynamicallyLoadedPage.helloMessage.isDisplayed());

       }

       @AfterMethod
    public void post(){
        CommonMethods.tearDown();
       }
}

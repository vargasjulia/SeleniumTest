package test;

import Pages.WindowPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;

public class WindowPageTest {
    public static WebDriver driver;

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



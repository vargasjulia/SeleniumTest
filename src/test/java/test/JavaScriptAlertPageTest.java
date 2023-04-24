package test;

import Pages.JavaScriptAlertPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;


public class JavaScriptAlertPageTest extends CommonMethods {

    @BeforeMethod
    public void preCondition() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:7080/login");
        driver.manage().window().maximize();

    }

    @Test
    public void javaScriptAlertTest() {
        JavaScriptAlertPage javaScriptAlertPage = new JavaScriptAlertPage();
        javaScriptAlertPage.jsAlertButton.click();
        Alert simple = driver.switchTo().alert();
        simple.accept();
        Assert.assertTrue(javaScriptAlertPage.alertMessage.isDisplayed());

        javaScriptAlertPage.jsConfirmButton.click();
        simple = driver.switchTo().alert();
        simple.dismiss();
        Assert.assertTrue(javaScriptAlertPage.alertMessage.isDisplayed());

        javaScriptAlertPage.jsPromptButton.click();
        simple = driver.switchTo().alert();
        String text = "Accepting the alert";
        simple.sendKeys(text);
        simple.accept();
        String conf = javaScriptAlertPage.alertMessage.getText();
        Assert.assertTrue(true, conf);//????


    }

    @AfterMethod
    public void postCondition() {
        CommonMethods.tearDown();
    }
}

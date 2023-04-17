package test;

import Pages.FileUploadPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;



public class FileUploadPageTest {
    public static WebDriver driver;
    @BeforeMethod
    public void preCondition(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:7080/upload");
        driver.manage().window().maximize();

    }

    @Test
    public void uploadTest(){
        FileUploadPage fileUploadPage=new FileUploadPage();
        fileUploadPage.BoxToUpload.click();
        fileUploadPage.getBoxToUpload();
        Assert.assertTrue(fileUploadPage.CheckMark.isDisplayed());


    }

    @AfterMethod
    public void post(){
        CommonMethods.tearDown();
    }

}

package test;


import Pages.FileDownloadPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.io.File;


public class FileDownloadPageTest {
    public static WebDriver driver;
    @BeforeMethod
    public void preCondition(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:7080/download");
        driver.manage().window().maximize();

    }

    @Test
    public void downloadTest(){
        FileDownloadPage fileDownloadPage=new FileDownloadPage();
        fileDownloadPage.file.click();
        File f=new File("fileDownloadPage.file");
        Assert.assertTrue(f.exists());

    }

    @AfterMethod
    public void post(){
        CommonMethods.tearDown();
    }
}

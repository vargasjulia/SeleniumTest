package test;

import Pages.IframePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;



public class IframePageTest extends CommonMethods{

    @BeforeMethod
    public void preCondition(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:7080/iframe");
        driver.manage().window().maximize();

    }

    @Test
    public void iframeTest(){

        IframePage iframePage= new IframePage();

        driver.switchTo().frame("iframePage.frame");
       iframePage.textBox.sendKeys("HomeTest");
       Assert.assertTrue(true, "HomeTest");
       driver.switchTo().defaultContent();

   }
    @AfterMethod
    public void postCondition(){
        CommonMethods.tearDown();
    }

}

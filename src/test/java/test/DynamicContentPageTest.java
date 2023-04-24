package test;

import Pages.DynamicContentPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;



public class DynamicContentPageTest extends CommonMethods{

    @BeforeMethod
    public void preCondition(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:7080/dynamic_content");
        driver.manage().window().maximize();

    }

    @Test
    public void DynamicContentTest(){
        DynamicContentPage dynamicContentPage = new DynamicContentPage();
        String p1=dynamicContentPage.Text1.getText();
        driver.navigate().refresh();
        Assert.assertEquals(p1,dynamicContentPage.Text1);
        System.out.println("Dynamic content working");

    }

    @AfterMethod
    public void post(){
        CommonMethods.tearDown();
    }
}

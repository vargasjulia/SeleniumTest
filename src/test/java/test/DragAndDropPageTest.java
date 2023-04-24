package test;

import Pages.DragAndDropPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;



public class DragAndDropPageTest extends CommonMethods{


    @BeforeMethod
    public void preCondition(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:7080/drag_and_drop");
        driver.manage().window().maximize();

    }

    @Test
    public void dragTest(){
        DragAndDropPage dragAndDropPage = new DragAndDropPage();
        Actions act=new Actions((WebDriver) driver);
        act.dragAndDrop(dragAndDropPage.BoxA, dragAndDropPage.BoxB);
        Assert.assertTrue(true, "B");


    }

    @AfterMethod
    public void post(){
        CommonMethods.tearDown();
    }
}

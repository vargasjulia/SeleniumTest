package test;

import Pages.NotificationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class NotificationPageTest {

    public static WebDriver driver;
    @BeforeMethod
    public void preCondition(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:7080/notification_message_rendered");
        driver.manage().window().maximize();


    }
    @Test
    public void NotificationTest(){
        NotificationPage notificationPage=new NotificationPage();
        notificationPage.here.click();
        notificationPage.message.isDisplayed();
        String action=notificationPage.message.getText();
        Assert.assertEquals(action,notificationPage.message);

        notificationPage.here.click();
        notificationPage.message.isDisplayed();
        String action1=notificationPage.message.getText();
        Assert.assertEquals(action1,notificationPage.message);

        notificationPage.here.click();
        notificationPage.message.isDisplayed();
        String action2=notificationPage.message.getText();
        Assert.assertEquals(action2,notificationPage.message);

        notificationPage.here.click();
        notificationPage.message.isDisplayed();
        String action3=notificationPage.message.getText();
        Assert.assertEquals(action3,notificationPage.message);
    }

    @AfterMethod
    public void post(){
        CommonMethods.tearDown();
    }
}

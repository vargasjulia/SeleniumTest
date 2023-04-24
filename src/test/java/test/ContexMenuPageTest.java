package test;

import Pages.CheckBoxPage;
import Pages.ContexMenuPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;



public class ContexMenuPageTest extends CommonMethods{


    @BeforeMethod
    public void preCondition(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:7080/context_menu");
        driver.manage().window().maximize();

    }

    @Test
    public void hoversTest(){
        ContexMenuPage contexMenuPage = new ContexMenuPage();
        Actions act=new Actions((WebDriver) driver);
        contexMenuPage.Box.isDisplayed();
        act.contextClick(contexMenuPage.Box);
        Alert simpleAlert=((WebDriver) driver).switchTo().alert();
        String alertText= simpleAlert.getText();
        System.out.println("Alert text is "+ alertText);
        simpleAlert.accept();

    }

    @AfterMethod
    public void post(){CommonMethods.tearDown();}
}

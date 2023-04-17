package test;

import Pages.CheckBoxPage;
import Pages.ContexMenuPage;
import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.CommonMethods;

import java.net.MalformedURLException;
import java.net.URL;

public class ContexMenuPageTest {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        String remote_url_chrome = "http://localhost:7080";
        ChromeOptions options = new ChromeOptions();
        driver.set(new RemoteWebDriver(new URL(remote_url_chrome), options));
        driver.get().navigate().to("https://localhost:7080/context_menu ");

        ContexMenuPage contexMenuPage = new ContexMenuPage();
        Actions act=new Actions((WebDriver) driver);
        contexMenuPage.Box.isDisplayed();
        act.contextClick(contexMenuPage.Box);
        Alert simpleAlert=((WebDriver) driver).switchTo().alert();
        String alertText= simpleAlert.getText();
        System.out.println("Alert text is "+ alertText);
        simpleAlert.accept();

        CommonMethods.tearDown();
    }
}

package test;

import Pages.CheckBoxPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.CommonMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class CheckBoxPageTest {
    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        String remote_url_chrome = "http://localhost:7080";
        ChromeOptions options = new ChromeOptions();
        driver.set(new RemoteWebDriver(new URL(remote_url_chrome), options));
        driver.get().navigate().to("https://localhost:7080/checkboxes");

        CheckBoxPage checkBoxPage= new CheckBoxPage();

        List<WebElement> list= (List<WebElement>) checkBoxPage.checkBox1;
       Boolean  is_selected=list.get(0).isSelected();
        if(is_selected){
            list.get(1).click();
        }else {
            list.get(0).click();
        }
        CommonMethods.tearDown();
    }
}

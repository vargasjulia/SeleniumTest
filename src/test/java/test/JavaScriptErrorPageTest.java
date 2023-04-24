package test;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;


import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

public class JavaScriptErrorPageTest extends CommonMethods {


    @BeforeMethod
    public void preCondition() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:7080/javascript_error ");
        driver.manage().window().maximize();
    }

    @Test
    public void javaScriptErrorTest() {
        String find = " Cannot read property 'xyz' of undefined.";
        driver.get(find);
        Set<String> log = driver.manage().logs().getAvailableLogTypes();
        for (String s : log) {
            System.out.println(log);
        }
        LogEntries entries = driver.manage().logs().get(LogType.BROWSER);
        List<LogEntry> lg = entries.filter(Level.ALL);
        for (LogEntry logEntry : lg) {
            System.out.println(logEntry);
        }

    }

    @AfterMethod
    public void postCondition () {
        CommonMethods.tearDown();

    }
}


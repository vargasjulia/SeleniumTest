package utils;


import org.openqa.selenium.WebDriver;


public class CommonMethods {





    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }


    }



}

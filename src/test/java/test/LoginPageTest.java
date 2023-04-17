package test;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;



public class LoginPageTest {

    public static WebDriver driver;
    @BeforeMethod
    public void preCondition(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:7080/login");
        driver.manage().window().maximize();

    }
  @Test
          public void validLoginTest() {
      LoginPage loginPage = new LoginPage();
      loginPage.usernamebox.click();
      loginPage.usernamebox.sendKeys("tomsmith");
      loginPage.passwordbox.click();
      loginPage.passwordbox.sendKeys("SuperSecretPassword!");
      loginPage.loginButton.click();
      Assert.assertTrue(loginPage.loginMessage.isDisplayed());
  }
  public void invalidLoginTest(){
      LoginPage loginPage1= new LoginPage();
       loginPage1.usernamebox.click();
        loginPage1.usernamebox.sendKeys("tomsmith");
      loginPage1.passwordbox.click();
       loginPage1.passwordbox.sendKeys("SuperSecretPassword");
        loginPage1.loginButton.click();
      Assert.assertTrue(loginPage1.errorMessage.isDisplayed());}

    public void invalidLoginTest2(){
        LoginPage loginPage2= new LoginPage();
       loginPage2.usernamebox.click();
       loginPage2.usernamebox.sendKeys("toms");
       loginPage2.passwordbox.click();
       loginPage2.passwordbox.sendKeys("SuperSecretPassword!");
       loginPage2.loginButton.click();
       Assert.assertTrue(loginPage2.errorMessage.isDisplayed());}


  @AfterMethod
          public void post() {
      CommonMethods.tearDown();
  }




    }


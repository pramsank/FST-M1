package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity7 {
    //declare webdriver
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws InterruptedException {
        //set up fire fox driver
        WebDriverManager.firefoxdriver().setup();
        //initialize a firefox driver
        driver = new FirefoxDriver();
        //initialize wait object
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Open Browser
        driver.get("https://www.training-support.net/selenium/login-form");
        Thread.sleep(5000);
    }

    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][]{{"admin", "password"}};
    }
    @Test(dataProvider = "Authentication")
    public void loginTC(String username, String password) {
        //Find the username field and enter value
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys(username);

        //Find the password field and enter value
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);

        //Click Log in
        driver.findElement(By.xpath("//button[contains(@class, 'ui button')]")).click();

        //Assert Message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }
    //close browser
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

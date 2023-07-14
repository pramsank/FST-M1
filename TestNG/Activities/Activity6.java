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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity6 {
    //declare a webdriver
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws InterruptedException {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //initialize  firefox driver
        driver = new FirefoxDriver();
        // Initialize the wait object
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
        Thread.sleep(5000);
    }

    @Test
    @Parameters({"username", "password"})
    public void loginTC(String username, String password) {
        //Find username and password fields
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        //Enter values
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);

        //Click Log in
        driver.findElement(By.xpath("//button[contains(@class, 'ui button')]")).click();

        //Assert Message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }
    @AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }
}


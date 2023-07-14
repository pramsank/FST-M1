package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    //declare a webdriver
    WebDriver driver;

    @BeforeClass
    public void setup() throws InterruptedException {
        //install gecko driver
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        WebDriverManager.firefoxdriver().setup();
        //initialize firefox driver
        driver = new FirefoxDriver();

        //launch the page
        driver.get("https://www.training-support.net/selenium/login-form");
        Thread.sleep(5000);
    }

    @Test
    public void loginTC() throws InterruptedException {
        //Find fields for authentication and enter credentials
        WebElement userName = driver.findElement(By.id("username"));
        WebElement pwd = driver.findElement(By.id("password"));
        //Enter credentials
        userName.sendKeys("admin");
        pwd.sendKeys("password");
        //find login button and click
        WebElement loginBtn = driver.findElement(By.xpath("//button[contains(@class,'ui button')]"));
        loginBtn.click();
        Thread.sleep(100);
        //Read login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals("Welcome Back, admin", loginMessage);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

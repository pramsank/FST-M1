package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {
        //Set up the fire fox web browser
        WebDriverManager.firefoxdriver().setup();
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Launch URL
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println("Title is: " + driver.getTitle());

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
        System.out.println("Page Confirmation: " + loginMessage);

        //close the browser
        driver.quit();
    }
}


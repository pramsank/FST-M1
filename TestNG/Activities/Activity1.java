package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity1 {
    //declare a webdriver
    WebDriver driver;

    @BeforeMethod
    public void setup() throws InterruptedException {
        //install gecko driver
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        WebDriverManager.firefoxdriver().setup();
        //initialize firefox driver
        driver = new FirefoxDriver();

        //launch the page
        driver.get("https://www.training-support.net");
        Thread.sleep(5000);
    }

    @Test
    public void helloWorld() {
        //get page title
        String PageTitle = driver.getTitle();
        //print page title on console
        System.out.println("Page Title is: " + PageTitle);
        //Assert Page Title
        Assert.assertEquals("Training Support", PageTitle);
        //find the about us link or button
        driver.findElement(By.id("about-link")).click();
        //find the new page title and print it
        System.out.println("New Page Title is: " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}

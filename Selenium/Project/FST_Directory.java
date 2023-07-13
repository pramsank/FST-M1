package ProjectActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class FST_Directory {
    //declare a webdriver
    WebDriver driver;

    @BeforeClass
    public void setup() throws InterruptedException {
        //install gecko driver
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        WebDriverManager.firefoxdriver().setup();
        //initialize firefox driver
        driver = new FirefoxDriver();
        //Implicit wait time set
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //launch the page
        driver.get("http://alchemy.hguy.co/orangehrm");
        Thread.sleep(5000);
    }
    @Test(priority = 0)
    public void SiteAccess() throws InterruptedException {
        // Login To Site
        WebElement Uid = driver.findElement(By.xpath("//form[@id='frmLogin']/div/input[@id='txtUsername']"));
        Uid.sendKeys("orange");
        WebElement pwd = driver.findElement(By.xpath("//form[@id='frmLogin']/div/input[@id='txtPassword']"));
        pwd.sendKeys("orangepassword123");
        WebElement clickbtn = driver.findElement(By.xpath("//form[@id='frmLogin']/div/input[@id='btnLogin']"));
        clickbtn.click();
        Thread.sleep(2000);
    }

    @Test (dependsOnMethods = {"SiteAccess"})
    public void DirectoryOption() throws InterruptedException {
        //find directory option from menu
        WebElement Directory = driver.findElement(By.id("menu_directory_viewDirectory"));
        //assertion - if directory option is displayed in menu
        Assert.assertEquals(true, Directory.isDisplayed());
        System.out.println("Directory option in menu is displayed – Assert passed");
        Directory.click();
        Thread.sleep(200);
        //assertion - if directory page title is displayed in menu
        WebElement DirectoryPageHeader = driver.findElement(By.xpath("//div[contains(@class, 'head')]/h1"));
        String heading1 = driver.findElement(By.xpath("//div[contains(@class, 'head')]/h1")).getText();
        Assert.assertEquals("Search Directory", heading1);
        System.out.println("Header is: " + heading1);
    }
    //close the browser
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}

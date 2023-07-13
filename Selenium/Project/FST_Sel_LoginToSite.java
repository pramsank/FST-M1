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

public class FST_Sel_LoginToSite {
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

    @Test
    public void LoginToSite() throws InterruptedException {
        // fill the fields in the form
        //WebElement Uid = driver.findElement(By.id("divUsername"));
        WebElement Uid = driver.findElement(By.xpath("//form[@id='frmLogin']/div/input[@id='txtUsername']"));
        Uid.sendKeys("orange");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement pwd = driver.findElement(By.xpath("//form[@id='frmLogin']/div/input[@id='txtPassword']"));
        pwd.sendKeys("orangepassword123");

        //submit credentials
        WebElement clickbtn = driver.findElement(By.xpath("//form[@id='frmLogin']/div/input[@id='btnLogin']"));
        clickbtn.click();
        Thread.sleep(5000);

        //instead of print write an assertion
        Assert.assertEquals("OrangeHRM", driver.getTitle());
        System.out.println("Title of the page is " + driver.getTitle());

    }
    //close the browser
    @AfterClass
    public void tearDown() {
       driver.quit();
    }
}

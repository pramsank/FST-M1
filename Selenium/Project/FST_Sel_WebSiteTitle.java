package ProjectActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FST_Sel_WebSiteTitle {
    public static void main(String[] args) throws InterruptedException {
        //Install  firefox driver
        WebDriverManager.firefoxdriver().setup();

        //Initialize firefox driver
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        WebDriver driver = new FirefoxDriver();
        //Implicit wait time set
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Open a page
        driver.get("http://alchemy.hguy.co/orangehrm");

        //get title of the page and print it
        System.out.println("Page Title: " + driver.getTitle());

        //close browser
        driver.quit();

    }



}

package ProjectActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class HeaderImage {
    //declare a webdriver
    WebDriver driver;

    @BeforeClass
    public void setup() {
        //install gecko driver
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        WebDriverManager.firefoxdriver().setup();
        //initialize firefox driver
        driver = new FirefoxDriver();

        //launch the page
        driver.get("http://alchemy.hguy.co/orangehrm");
    }

    @Test
    public void WebImageURL() {
        //find the title of webpage
        //WebElement headerImage = driver.findElement(By.id("divLogo"));
        WebElement imgUrl = driver.findElement(By.xpath("//img[@src='/orangehrm/symfony/web/webres_5d69118beeec64.10301452/themes/default/images/login/logo.png']"));
        //print url of header image to console
        System.out.println("Src element is: " + imgUrl.getAttribute("src"));
    }

    //close the browser
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
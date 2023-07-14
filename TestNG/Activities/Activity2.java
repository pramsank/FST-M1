package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity2 {
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
        driver.get("https://www.training-support.net/selenium/target-practice");
        Thread.sleep(5000);
    }

    @Test
    public void getTitle() {
        //Positive scenario
        //get page title
        String PgTitle = driver.getTitle();
        System.out.println("Page Title is: " + PgTitle);
        //Assert Page Title
        Assert.assertEquals(PgTitle , "Target Practice");
    }
    @Test
    public void blackBtnNeg() {
        //Negative Scenario - will fail
        WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "black");
    }

    @Test(enabled = false)
    public void skipTest() {
        //This test will be skipped and not counted
        String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }

    @Test
    public void skipShowTC() {
        //This test will be skipped and will be be shown as skipped
        throw new SkipException("Skipping test case");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

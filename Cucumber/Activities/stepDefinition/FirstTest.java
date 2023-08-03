package stepDefinition;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

public class FirstTest extends BaseClass{
    @BeforeAll
    public static void setUp() {
        //gecko driver install
        WebDriverManager.firefoxdriver().setup();
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        //initialize driver
        driver = new FirefoxDriver();
        //initialize wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Given("I launch TS page")
    public void openTSHomePage(){
        //open a page
        driver.get("https://www.training-support.net/");
        //assertions
        assertEquals("Training Support", driver.getTitle());
    }

    @When("the user clicks on About Us link")
    public void clickAboutUs(){
        //find the about us button and click it
        driver.findElement(By.id("about-link")).click();
    }

    @Then("the user is redirected to About Us page")
    public void titleValidation(){
        //verify about us page
        assertEquals("About Training Support", driver.getTitle());
    }
}

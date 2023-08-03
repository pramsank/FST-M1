package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps extends BaseClass{
    @Given("User is on Login page")
    public void OpenLoginPage() {
        //open a page
        driver.get("https://www.training-support.net/selenium/login-form");
        //assertions
        assertEquals("Login Form", driver.getTitle());
    }


    @When("User enters {string} and {string}")
    public void enterUserCreds(String username, String password) {
        //find the element username and enter value
        driver.findElement(By.id("username")).sendKeys(username);
        //find the element password and enter value
        driver.findElement(By.id(password)).sendKeys(password);
        //find element Login button and click it
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

    }
    @Then("Read the page title and confirmation message")
    public void readPageTitleConfirm() {
        //read the page title and heading
        String pageTitle = driver.getTitle();
        String message = driver.findElement(By.id("action-confirmation")).getText();

        //Print on console
        System.out.println("Page title is: " + pageTitle);
        System.out.println("Login message is: " + message);

        //Assertion heading
        assertEquals("Welcome Back, admin", message);
    }
}

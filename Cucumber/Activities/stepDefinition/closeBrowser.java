package stepDefinition;


import io.cucumber.java.en.And;

public class closeBrowser extends BaseClass{
    @And("close the browser")
    public void closeBrowser(){
        //close the browser
        driver.quit();
    }
}

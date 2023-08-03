package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = {"stepDefinitions"},
        tags = "@SimpleAlert",
        // pretty report
        plugin = {"pretty"},
        /* html report
        plugin = {"html: test-reports"},
         */
        /* json report
        plugin = {"json: test-reports/json-report.json"},
         */
        monochrome = true
)

public class ActivitiesRunner {
    //This is intentionally blank
}


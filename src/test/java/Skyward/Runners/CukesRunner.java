package Skyward.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html", //copy from content root
        features = "src/test/resources/features", //copy from content root
        glue = "Skyward/Step_Definitions" //copy from source root



)

public class CukesRunner {
}

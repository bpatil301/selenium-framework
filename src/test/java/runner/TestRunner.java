
package runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/features",
 glue = "com.example.stepdefinitions",
        plugin = {"pretty","html:target/cucmber-report.html"}
        )

public class TestRunner extends AbstractTestNGCucumberTests {
}

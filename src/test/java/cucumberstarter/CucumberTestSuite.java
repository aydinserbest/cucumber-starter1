package cucumberstarter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumberstarter/example.feature",
                glue = "cucumberstarter")
public class CucumberTestSuite {
}

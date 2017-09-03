package StepDefitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by OHLAR on 7/22/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "F:\\CukesProjDemo\\src\\test\\resources",
        plugin = {"html:target/cucumber"},
        tags = {"@positive,"},
        monochrome = false
)
public class RunnerTest {
}

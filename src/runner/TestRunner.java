package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/hooks.feature", glue = { "stepDefinition" }, plugin = { "pretty"}, monochrome = true) // ,tags= {"@invalidlogin"})//, glue= {"stepDefinition"})
public class TestRunner {

}

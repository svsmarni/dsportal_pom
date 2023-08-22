package stepDefintion;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue= {"stepDefintion"}, monochrome=true, plugin = {"pretty", "json:target/JSONreports/report.json"})
public class testrunner {

}

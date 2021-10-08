package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Inis.feature",glue={"StepDefinitions"},
monochrome = true,
plugin= {"pretty","junit:target/JunitReports/report.xml","html:target/htmlReports/report.html"}

		)	
public class CountryRunner {

}

package stepsDefinations;

import org.junit.runner.RunWith;


//@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions(features="src/test/resources/features",glue={"stepsDefinations"},monochrome = true,
plugin = {"pretty","json:target/jsonReportsBDD","html:target/htmlReportsBDD","junit:target/junitReportsBDD"}
,tags="@smokeTest or @regressionTest")
public class StepRunner {

}

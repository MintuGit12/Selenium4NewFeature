package stepsDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/HooksFeature.feature",glue={"stepsDefinations/LoginSteps"},monochrome = true,
plugin = {"pretty","json:target/jsonReportsBDD","html:target/htmlReportsBDD","junit:target/junitReportsBDD"}
,tags="@smokeTest or @regressionTest")
public class StepRunnerHooks {

}

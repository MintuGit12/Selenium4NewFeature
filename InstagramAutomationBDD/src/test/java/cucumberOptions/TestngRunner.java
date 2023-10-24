package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features/FirstProgram.feature",glue={"stepsDefinations"},monochrome=true
,tags="@SmokeTest and @RegressionTest or @SanityTest",plugin={"pretty","html:target/cucumber.html"})
public class TestngRunner extends AbstractTestNGCucumberTests {
 
}

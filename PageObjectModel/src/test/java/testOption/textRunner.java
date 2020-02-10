package testOption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		format = { "pretty", "html:target/cucumber", "json:target/cucumber-report.json" },features = "C:\\Users\\auhum\\eclipse-workspace\\PageObjectModel\\src\\test\\java\\featureFile"
 ,glue={"stepDefinitons"},tags= {"@Smoke"},dryRun=false)
public class textRunner extends AbstractTestNGCucumberTests {

}

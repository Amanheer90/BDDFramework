package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\QA\\Selenium_WorkSpace\\PrestoBDDFramework\\src\\main\\java\\Features\\voucher.feature"},//the path of the feature files
		glue={"stepDefinitions"}, //step Definition Package Name
		monochrome = true, //display the console output in a proper readable format
		dryRun = false
		//tags = "not @RegressionTest"
		)


public class TestRunner {
	

}

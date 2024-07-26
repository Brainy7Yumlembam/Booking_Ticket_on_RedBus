package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" , "html:target/cucumber-default-report.html","rerun:target/rerun.txt"},features = "src/main/java/feature2"
		,glue={"StefDef"},dryRun = false,monochrome = true)


public class Runner {

}

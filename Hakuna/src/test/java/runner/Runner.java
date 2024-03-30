package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//runer is used for execution

@CucumberOptions(
        features = {"src/test/resources/featurefile"},
        glue = {"stepdefinationfile"},
        tags = "@css",
        plugin = {"pretty",
                "html:target/report/cucumberreport.html",
                "junit:target/report/junitreport.xml",
                "json:target/report/jsonreport.json"}
)

public class Runner {
}

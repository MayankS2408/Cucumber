package Stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Featurefile",
glue= {"Stepdefinitions"}, 
monochrome=true,
plugin={"pretty","html:target/HTMLReports/report.html",
"json:target/JSONReports/report.json"})

public class RunnerTest {

}

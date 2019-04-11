package co.com.google.qa.googlesearchwhitdata.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", 
	glue = {"co.com.google.qa.googlesearchwhitdata.stepsdefinitions" }, 
	snippets = SnippetType.CAMELCASE, plugin = {
				"pretty", "html:target/cucumber", "json:target/cucumber/cucumber.json" })

public class GoogleSearchWithDataRunner {
	

}

package com.test.atul.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/cucumber"},
		features = {"src/test/resources/features"},
		glue = {"com/test/atul/stepdefination","com/test/atul/testrunner"}
		)
public class TestRunner {
	

}



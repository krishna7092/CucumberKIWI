package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target\\failedtc.txt",glue = "Stepdefinitions",
dryRun = false,  monochrome = true,
plugin = {"html:reports\\pretty.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		})

public class Rerunner extends AbstractTestNGCucumberTests {

	

}

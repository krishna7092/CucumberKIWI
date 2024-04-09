package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(features = "src\\test\\java\\Features",glue = "Stepdefinitions",
dryRun = false,  monochrome = true,
plugin = {"html:reports\\pretty.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target\\failedtc.txt"})


public class TestRunner extends AbstractTestNGCucumberTests {
		
		@DataProvider(parallel = true)
		@Override
		public Object[][] scenarios() {
			// TODO Auto-generated method stub
			return super.scenarios();
		}
}

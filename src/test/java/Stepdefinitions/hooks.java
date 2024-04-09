package Stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Scenario;

import Utils.PicoInject;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class hooks {
	WebDriver driver;
	public hooks(PicoInject inject) {
		// TODO Auto-generated constructor stub
		System.out.println(" in hooks");
		driver=inject.driver;
	}
	
	
	@Before
	public void before() {
		System.out.println("HOOKS BEFORE ___________________");
	}
	@After
	public void closebrowser() {
		driver.quit();
	}
	
	@AfterStep
	public void takescreenshot(Scenario sc) throws IOException {
		if(sc.isFailed()){
			File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			sc.attach(FileUtils.readFileToByteArray(screenshotAs), "image/png", "error");
			try {
				FileUtils.copyFile(screenshotAs, new File("test-output\\failedsc\\failed.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	}
	
	

}

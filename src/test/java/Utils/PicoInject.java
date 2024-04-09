package Utils;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import PageObjects.PageObjectFactory;
import Stepdefinitions.HomeSteps;

public class PicoInject {

	public WebDriver driver;

	public HomePage hm;

	public PageObjectFactory Page;
	
	public Genericmethods generic;

	public PicoInject() throws FileNotFoundException, IOException { // TODO Auto-generated constructor stub object =new
		System.out.println(" First IN pico container it will start to intialize all the values");
		driver=new BaseTest().getdriver();
		Page =new PageObjectFactory (driver);
		generic=new Genericmethods(driver);
	}

}

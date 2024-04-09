package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectFactory {
	WebDriver driver;
	HomePage home;
	Carpage car;
	public PageObjectFactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		System.out.println("three with the drive i am initliazing a all the pages");
		this.driver=driver;
		
		
	}
	
	public HomePage HomePage() {
		return new HomePage(driver);
		
	}
	
	
	public Carpage Carpage() {
		return new Carpage(driver);
		
	}
	
}

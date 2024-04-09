package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Carpage;
import PageObjects.HomePage;
import PageObjects.PageObjectFactory;
import Utils.Genericmethods;
import Utils.PicoInject;
import io.cucumber.java.en.Given;

public class HomeSteps {
	PicoInject pico;
	HomePage homePage;
	public HomeSteps(PicoInject pico) {
		// TODO Auto-generated constructor stub
		System.out.println( "5 home page launched with the all the required this in pico");
		this.pico=pico;
		homePage = pico.Page.HomePage();
	}
	
	
	
	HomePage home;
	WebDriver driver;
	@Given("Launch the url in browser")
	public void launch_the_url_in_browser() {
		
		
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	
	@Given("close the popup with in {int} sec")
	public void close_the_popup_with_in_sec(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		homePage.closepopup(4);
		
		
		
		
	}
}

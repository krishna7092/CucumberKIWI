package Stepdefinitions;

import org.testng.Assert;

import PageObjects.Carpage;
import PageObjects.PageObjectFactory;
import Utils.Genericmethods;
import Utils.PicoInject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CarPageSteps {
	PicoInject pico;
	Carpage carpage;
	Genericmethods generic; 
	public CarPageSteps(PicoInject pico) {
		// TODO Auto-generated constructor stub
		this.pico=pico;
		carpage= pico.Page.Carpage();
		generic=pico.generic;
	}
	
	@Given("User click the kiwicar")
	public void user_click_the_kiwicar() {
	    // Write code here that turns the phrase above into concrete actions
		
		carpage.clickcar();
		pico.generic.switchwindow("child");
	}
	@Then("user should successfully open carhire")
	public void user_should_successfully_open_carhire() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Then("should see currency as {string}")
	public void should_see_currency_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println(carpage.getcurrencytext());
		Assert.assertEquals("SDF", carpage.getcurrencytext());
	   
	}
}

package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Carpage extends Abstractgeneric {
	
	
	public Carpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		System.out.println( "6 home page launched with the all the required this in pico");
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(css = "[data-testid=\"currency-button\"]")
	WebElement currenytext;
	
	
	
	
	
	public String getcurrencytext() {
		//waittovisible(waittime, currenytext);
		return currenytext.getText();
	}

}

package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
	
	public WebDriver driver;
	
	public WebDriver getdriver() throws FileNotFoundException, IOException {
		Properties prop=new Properties();
		prop.load(new FileInputStream(System.getProperty("user.dir") +"\\src\\test\\resources\\PropertiesFile\\Global.properties"));
		System.out.println("second IN baseTest which creaate a diver");
		String URL = prop.getProperty("URL");
		String Browser =System.getProperty("browser")!=null? System.getProperty("browser") :  prop.getProperty("Browser");
		if (Browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			driver=new EdgeDriver();
		}
		
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
	}
	

}

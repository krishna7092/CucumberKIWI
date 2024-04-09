package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Genericmethods {
	WebDriver driver;
	public Genericmethods(WebDriver driver) {
		// TODO Auto-generated constructor stub
		System.out.println("four driver with genric utils");
		this.driver=driver;
	}
	
	public  void switchwindow(String name) {
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String parent=iterator.next();
		String Child =iterator.next();
		if(name.equalsIgnoreCase("child")) {
			driver.switchTo().window(Child);
			System.out.println("jump to child");
		}else if(name.equalsIgnoreCase("parent")){
			driver.switchTo().window(parent);
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}

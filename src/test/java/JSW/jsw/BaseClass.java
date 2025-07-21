package JSW.jsw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	WebDriver driver;
	@BeforeClass 
	
	public WebDriver setApplication() {
		driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		return driver;
	}
	
	
	

}

package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMathods {

	public static ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition() {
				//step0: setup the driver using webdriver manager
				WebDriverManager.chromedriver().setup();
				
				//Step1: Launch Browser
				 driver = new ChromeDriver();
			
				//step 2: load url
				driver.get("http://leaftaps.com/opentaps/control/main");

				//step:3 maximize the screen
				driver.manage().window().maximize();	

	}
	@AfterMethod
	public void postCondition() {
		// step: to close the browser
		driver.close();

	}
}

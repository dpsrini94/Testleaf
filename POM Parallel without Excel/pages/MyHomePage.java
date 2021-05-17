package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMathods;

public class MyHomePage extends ProjectSpecificMathods{
	
	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	public MyLeadPage clickLeadTab() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadPage(driver);

	}

}

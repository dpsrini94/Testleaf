package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMathods;

public class MyLeadPage extends ProjectSpecificMathods {

	public MyLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	public CreateleadPage clickCreateLeadTab() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateleadPage(driver);
	}
}

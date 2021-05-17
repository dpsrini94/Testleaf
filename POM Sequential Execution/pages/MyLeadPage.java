package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMathods;

public class MyLeadPage extends ProjectSpecificMathods {

	public CreateleadPage clickCreateLeadTab() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateleadPage();
	}
}

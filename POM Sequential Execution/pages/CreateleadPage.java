package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMathods;

public class CreateleadPage extends ProjectSpecificMathods{

		public CreateleadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL Technologies");
		return this;
	}
	
	public CreateleadPage enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhivyapriya");
		return this;
	}
	
	public CreateleadPage enterSecondName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Srinivasan");
		return this;
	}
	
	public CreateleadPage clickCreateLeadButton() {
		driver.findElement(By.className("smallSubmit")).click();
		return this;
	}
}

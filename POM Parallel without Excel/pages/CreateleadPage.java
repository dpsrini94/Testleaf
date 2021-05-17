package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMathods;

public class CreateleadPage extends ProjectSpecificMathods{

	public CreateleadPage(ChromeDriver driver) {
		this.driver = driver;
	}
		public CreateleadPage enterCompanyName(String CompName)  {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompName);
		return this;
			}
	
	public CreateleadPage enterFirstName(String fName) {
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	}
	
	public CreateleadPage enterSecondName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewLeadPage(driver);
	}
	
	


}

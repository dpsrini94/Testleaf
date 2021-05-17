package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMathods;

public class MyHomePage extends ProjectSpecificMathods{
	
	public MyLeadPage clickLeadTab() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadPage();

	}

}

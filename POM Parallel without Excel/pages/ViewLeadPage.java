package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMathods;

public class ViewLeadPage extends ProjectSpecificMathods {
	
	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public ViewLeadPage ViewLead() {
		System.out.println("Lead is created");
		return this;
	}
}

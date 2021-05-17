package testCases;

import org.testng.annotations.Test;

import base.ProjectSpecificMathods;
import pages.LoginPage;


public class CreateLead extends ProjectSpecificMathods{
	@Test
	public void createLead()  {
		
		new LoginPage(driver).enterUserName().enterPassword().clickSubmit().clickLink().clickLeadTab().clickCreateLeadTab()
																								.enterCompanyName("HCL")
																								.enterFirstName("Dhivya")
																								.enterSecondName("Raghavan")
																								.clickCreateLeadButton()
																								.ViewLead();
		
	}
}

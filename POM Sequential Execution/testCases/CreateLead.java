package testCases;

import org.testng.annotations.Test;

import base.ProjectSpecificMathods;
import pages.LoginPage;
import pages.MyHomePage;

public class CreateLead extends ProjectSpecificMathods{
	@Test
	public void createLead() {
		
		new LoginPage().enterUserName().enterPassword().clickSubmit().clickLink().clickLeadTab().clickCreateLeadTab()
																								.enterCompanyName()
																								.enterCompanyName()
																								.enterSecondName()
																								.clickCreateLeadButton();
		//new MyHomePage().clickLeadTab().clickCreateLeadTab().enterCompanyName()
															/*.enterFirstName()
															.enterSecondName()
															.clickCreateLeadButton();*/

	}
}

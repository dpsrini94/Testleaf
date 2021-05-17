package testCases;

import org.testng.annotations.Test;

import base.ProjectSpecificMathods;
import pages.LoginPage;

public class LoginLogout extends ProjectSpecificMathods{
	@Test
	public void LoginAndLogout() {
		
		LoginPage lp = new LoginPage();
		lp.enterUserName().enterPassword().clickSubmit().clickLink();

	}

}

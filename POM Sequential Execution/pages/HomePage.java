package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMathods;

public class HomePage extends ProjectSpecificMathods {

	public MyHomePage clickLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	} 
	
	public void clickLogout() {
		// TODO Auto-generated method stub

	}
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMathods;

public class HomePage extends ProjectSpecificMathods {

	public HomePage(ChromeDriver driver) {
		this.driver = driver;
			}
	public MyHomePage clickLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	} 
	
	public void clickLogout() {
		// TODO Auto-generated method stub

	}
}

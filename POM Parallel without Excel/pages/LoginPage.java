package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMathods;

public class LoginPage extends ProjectSpecificMathods {
	public LoginPage( ChromeDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage enterUserName() {
		//step4: Find user name and pass value
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				return this;
			}
	
	public LoginPage enterPassword() {
		//step5: find password and pass value
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
			}
	
	public HomePage clickSubmit() {
		//step6: find login and clicks
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}
}

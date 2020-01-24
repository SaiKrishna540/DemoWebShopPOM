package demoWebShopPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {
	
	WebDriver driver;
	
	By loginpath = By.xpath("//a[@class='ico-login']");
	By email = By.xpath("//input[@id='Email']");
	By password = By.xpath("//input[@id='Password']");
	By signin = By.xpath("//input[@class='button-1 login-button']");
	By signout = By.xpath("//a[@class='ico-logout']");
	
	public LoginPagePOM(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clicklogin() {
		driver.findElement(loginpath).click();
	}
	
	public void enteremail(String EM) {
		driver.findElement(email).sendKeys(EM);
	}

	public void enterpassword(String PWD) {
		driver.findElement(password).sendKeys(PWD);
	}
	
	public void clicksignin() {
		driver.findElement(signin).click();
	}
	
	public void clicksignout() {
		driver.findElement(signout).click();
	}
}


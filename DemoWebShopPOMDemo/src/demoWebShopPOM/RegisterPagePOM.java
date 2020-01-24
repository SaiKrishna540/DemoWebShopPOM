package demoWebShopPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPagePOM {

	WebDriver driver;
	
	By registerpath = By.xpath("//a[@class='ico-register']");
		
	By firstname = By.id("FirstName");
	By lastname = By.id("LastName");
	By email = By.id("Email");
	By password = By.id("Password");
	By confirmpassword = By.id("ConfirmPassword");
	By register = By.xpath("//input[@id='register-button']");
	By logout = By.xpath("//a[@class='ico-logout']");
	
	public RegisterPagePOM(WebDriver driver) {
		this.driver = driver;
	}
	
	public void registerclick() {
		driver.findElement(registerpath).click();
	}
	
	public void enterfirstname(String FN) {
		driver.findElement(firstname).sendKeys(FN);
	}
	
	public void enterlastname(String LN) {
		driver.findElement(lastname).sendKeys(LN);
	}
	
	public void enteremail(String EM) {
		driver.findElement(email).sendKeys(EM);
	}
	
	public void enterpassword(String PWD) {
		driver.findElement(password).sendKeys(PWD);
	}
	
	public void enterconfirmpassword(String CPWD) {
		driver.findElement(confirmpassword).sendKeys(CPWD);
	}
	
	public void clickregister() {
		driver.findElement(register).click();
	}
	
	public void clicksignout() {
		driver.findElement(logout).click();
	}
}

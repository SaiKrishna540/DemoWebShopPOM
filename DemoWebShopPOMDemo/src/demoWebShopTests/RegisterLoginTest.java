package demoWebShopTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import demoWebShopPOM.LoginPagePOM;
import demoWebShopPOM.RegisterPagePOM;

public class RegisterLoginTest {

	WebDriver driver;
	
	@BeforeMethod
	public void startapp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void checkregister() {
		
		RegisterPagePOM register = new RegisterPagePOM(driver);
	
		register.registerclick();
		
		register.enterfirstname("sas");
		register.enterlastname("uke");
		register.enteremail("sasuke26@gmail.com");
		register.enterpassword("sasuke");
		register.enterconfirmpassword("sasuke");
		register.clickregister();

		String expectedresult = "Your registration completed";
		String actualresult = driver.findElement(By.xpath("//*[contains(text(),'Your registration completed')]")).getText(); 

		Assert.assertEquals(expectedresult, actualresult);

		register.clicksignout();
	}
	
	@Test (priority = 1)
	public void checklogin() {
				
		LoginPagePOM login = new LoginPagePOM(driver);
		
		login.clicklogin();
		
		login.enteremail("saikrishna12@gmail.com");
		login.enterpassword("Sai143");
		login.clicksignin();
		login.clicksignout();
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
}

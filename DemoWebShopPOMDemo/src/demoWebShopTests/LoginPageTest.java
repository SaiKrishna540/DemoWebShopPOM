package demoWebShopTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import demoWebShopPOM.LoginPagePOM;

public class LoginPageTest {
	
	@Test
	public void checklogin() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		LoginPagePOM login = new LoginPagePOM(driver);
		
		login.clicklogin();
		
		login.enteremail("saikrishna12@gmail.com");
		login.enterpassword("Sai143");
		login.clicksignin();
		login.clicksignout();
	}
}

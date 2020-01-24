package demoWebShopTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import demoWebShopPOM.RegisterPagePOM;

public class RegisterPageTest {

	@Test
	public void checkregister() {

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		RegisterPagePOM register = new RegisterPagePOM(driver);
		
		register.registerclick();
		
		register.enterfirstname("sas");
		register.enterlastname("uke");
		register.enteremail("sasuke19@gmail.com");
		register.enterpassword("sasuke");
		register.enterconfirmpassword("sasuke");
		register.clickregister();
		register.clicksignout();
	}
}

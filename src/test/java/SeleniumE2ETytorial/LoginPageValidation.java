package SeleniumE2ETytorial;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import resources.Base;

public class LoginPageValidation extends Base{
	
	public static Logger log = LogManager.getLogger(Base.class.getClass());
	
	@BeforeTest
	public void BrowserLaunch() throws IOException
	{
		driver = initializeDriver();
	}
	
	@Test(dataProvider="getData")
	public void LoginValidation(String email, String Password)
	{
		driver.get(prop.getProperty("URL"));
		log.info("Application Launched");
		LoginPage LoP = new LoginPage(driver);
		LoP.getLnkLogin().click();
		log.info("Navigated to Login Screen");
		LoP.getTxtEmaillAddress().sendKeys(email);
		log.info("Email Address Entered");
		LoP.getTxtPassword().sendKeys(Password);
		log.info("Password entered");
		LoP.getBtnLogin().click();
		log.info("Login Button Has been clicked");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj = new Object[2][2];
		
		obj[0][0] = "internalUser@mail.com";
		obj[0][1] = "test123";
		
		obj[1][0] = "agencyadmin@mail.com";
		obj[1][1] = "123test";
		
		return obj;
	}
	
	@AfterTest
	public void BrowserClose()
	{
		driver.quit();
		driver=null;
	}

}

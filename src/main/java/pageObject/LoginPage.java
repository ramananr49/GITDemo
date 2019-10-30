package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}

	By lnkLogin = By.cssSelector("a[href*='sign_in']");
	
	By txtEmailAddress = By.cssSelector("input[id='user_email']");
	
	By txtPassword = By.id("user_password");
	
	By btnLogin = By.name("commit");
	
	public WebElement getLnkLogin()
	{
		return driver.findElement(lnkLogin);
	}
	
	public WebElement getTxtEmaillAddress()
	{
		return driver.findElement(txtEmailAddress);
	}
	
	public WebElement getTxtPassword()
	{
		return driver.findElement(txtPassword);
	}
	
	public WebElement getBtnLogin()
	{
		return driver.findElement(btnLogin);
	}
}

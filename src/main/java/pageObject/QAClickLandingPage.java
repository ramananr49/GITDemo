package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QAClickLandingPage {
	
	public WebDriver driver;
	
	public QAClickLandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By lblHome = By.xpath("//ul[@class='nav navbar-nav navbar-right']//li[1]");
	
	By lblCourse = By.xpath("//ul[@class='nav navbar-nav navbar-right']//li[2]");
	
	By lblVideos = By.xpath("//ul[@class='nav navbar-nav navbar-right']//li[3]");
	
	By lblInterviewGuide = By.xpath("//ul[@class='nav navbar-nav navbar-right']//li[4]");
	
	By lblPractice = By.xpath("//ul[@class='nav navbar-nav navbar-right']//li[5]");
	
	By lblBlog = By.xpath("//ul[@class='nav navbar-nav navbar-right']//li[6]");
	
	By lblAbout = By.xpath("//ul[@class='nav navbar-nav navbar-right']//li[7]");
	
	By lblContact = By.xpath("//ul[@class='nav navbar-nav navbar-right']//li[8]");
	
	By lblHomeText = By.xpath("//div[@class='row'] //h3[contains(text(), 'Academy')]");
	
	
	
	public WebElement getLblHome()
	{
		return driver.findElement(lblHome);
	}
	
	public WebElement getLblCourse()
	{
		return driver.findElement(lblCourse);
	}
	
	public WebElement getLblVideos()
	{
		return driver.findElement(lblVideos);
	}
	
	public WebElement getLblInterviewGuide()
	{
		return driver.findElement(lblInterviewGuide);
	}
	
	public WebElement getLblPractice()
	{
		return driver.findElement(lblPractice);
	}
	
	public WebElement getLblBlog()
	{
		return driver.findElement(lblBlog);
	}
	
	public WebElement getLblAbout()
	{
		return driver.findElement(lblAbout);
	}
	
	public WebElement getLblContact()
	{
		return driver.findElement(lblContact);
	}
	
	public WebElement getLblHomeText()
	{
		return driver.findElement(lblHomeText);
	}
}

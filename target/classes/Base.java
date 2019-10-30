package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		String path = "C:\\Users\\Venkat Ramanan\\SeleniumFrameworkTutorial\\src\\main\\java\\resources\\GlobalData.Properties";
		prop = new Properties();
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		
		//String BrowserName = prop.getProperty("Browser");
		
		String BrowserName = System.getProperty("Browser");
		
		if(BrowserName.contains("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", prop.getProperty("CDPath"));
		ChromeOptions options = new ChromeOptions();
		if(BrowserName.contains("-headless"))
		{
			options.addArguments("headless");
		}
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		}
		else if(BrowserName.contains("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", prop.getProperty("FDPath"));
			FirefoxOptions options = new FirefoxOptions();
			if(BrowserName.contains("headless"))
			{
				options.addArguments("headless");
			}
			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
		}
		else if(BrowserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", prop.getProperty("IEDPath"));
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		
		return driver;
	}
	
	public void takeScrshot(String result) throws IOException
	{
		String timeStamp = new SimpleDateFormat("YYYYMMDD_HHMM").format(Calendar.getInstance().getTime());
		File ScrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScrFile, new File("C:\\Users\\Venkat Ramanan\\Desktop\\Automation\\TestResults\\"+result+"_Screenshot_"+timeStamp+".png"));
	}

	
}

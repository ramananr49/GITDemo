package SeleniumE2ETytorial;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.QAClickLandingPage;
import resources.Base;

public class HomePageNavigation extends Base{
	
	public static Logger log = LogManager.getLogger(Base.class.getClass());
	
	@BeforeTest
	public void BrowserLaunch() throws IOException
	{
		driver = initializeDriver();
	}
	
	@Test
	public void NavigateToHomepage()
	{
		driver.get(prop.getProperty("URL"));
		log.info("Application Launched");
		QAClickLandingPage LP = new QAClickLandingPage(driver);
		String ActualHomeText = LP.getLblHomeText().getText();
		log.info(ActualHomeText);
		assertEquals(ActualHomeText, "AN ACADEMY TO LEARN everything ABOUT TESTING");
	}
	
	@AfterTest
	public void BrowserClose()
	{
		driver.close();
		driver=null;
	}

}

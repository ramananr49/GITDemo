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

public class HomePageHeaderValidation extends Base{
	
	public static Logger log = LogManager.getLogger(Base.class.getClass());
	
	@BeforeTest
	public void BrowserLaunch() throws IOException
	{
		driver = initializeDriver();
	}
	
	@Test
	public void HeaderValidation()
	{
		driver.get(prop.getProperty("URL"));
		log.info("Application Launched");
		QAClickLandingPage LP = new QAClickLandingPage(driver);
		assertEquals(LP.getLblHome().isDisplayed(), true);
		log.info("Home Label is Displayed");
		assertEquals(LP.getLblCourse().isDisplayed(), true);
		log.info("Courses Label is Displayed");
		assertEquals(LP.getLblVideos().isDisplayed(), true);
		log.info("Videos Label is Displayed");
		assertEquals(LP.getLblInterviewGuide().isDisplayed(), true);
		log.info("Interview Guide Label is Displayed");
		assertEquals(LP.getLblPractice().isDisplayed(), true);
		log.info("Practice Label is Displayed");
		assertEquals(LP.getLblBlog().isDisplayed(), true);
		log.info("Blog Label is Displayed");
		assertEquals(LP.getLblAbout().isDisplayed(), true);
		log.info("About Label is Displayed");
		assertEquals(LP.getLblContact().isDisplayed(), true);
		log.info("Contact Label is Displayed");
	}
	
	@AfterTest
	public void BrowserClose()
	{
		driver.quit();
		driver=null;
	}

}

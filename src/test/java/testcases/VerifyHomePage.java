package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import dataprovider.ConfigDataProvider;
import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.HomePage;
import utility.Helper;

public class VerifyHomePage {
	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeMethod()
	public void intialconfig()
	{
	report =new ExtentReports("C:\\Users\\mssiv\\workspace\\HybridFramework\\reports\\Homepagereport.html",true);
	//logger =new ExtentTest("Very home page","This page will display home page");
		logger = report.startTest("Verify home page");
		driver =BrowserFactory.getBrowser("chrome");
		driver.get(DataProviderFactory.getconfig().getapplicationurl());
		logger.log(LogStatus.INFO, "Application is up and running");
	}
	
/*	@Test
	public void validhomepage()
	{
		
		HomePage page =PageFactory.initElements(driver, HomePage.class);
		page.clickonfeatures();
		logger.log(LogStatus.PASS, "Feature link is opening");
	} */
	
	@Test
	public void createnewstore()
	{
		HomePage page =PageFactory.initElements(driver, HomePage.class);
		page.createnewstore();
		logger.log(LogStatus.PASS, "create a new store");
	}
	
	@AfterMethod
	public void teardown(ITestResult result)
	{
		if (result.getStatus()==ITestResult.SUCCESS)
		{
		
	//	System.out.println(path);
			String path=Helper.captureScreenshot(driver, result.getName());
	//	logger.log(LogStatus.PASS, logger.addScreenCapture(path));
		logger.log(LogStatus.PASS, logger.addScreenCapture(path));
	
		}
		report.endTest(logger);
		report.flush();
	}
}

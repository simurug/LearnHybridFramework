package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import dataprovider.ConfigDataProvider;
import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.HomePage;

public class VerifyHomePagewithReport {
	
	@Test
	public void validhomepage()
	{
		WebDriver driver=BrowserFactory.getBrowser("chrome");
		driver.get(DataProviderFactory.getconfig().getapplicationurl());
		HomePage page =PageFactory.initElements(driver, HomePage.class);
		page.clickonfeatures();
	}
	 
}

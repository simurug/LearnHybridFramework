package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataprovider.ConfigDataProvider;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static  WebDriver getBrowser(String browsername)
	{
		if (browsername.equalsIgnoreCase("chrome"))
		{
			ConfigDataProvider config = new ConfigDataProvider();
			System.setProperty("webdriver.chrome.driver",config.chromepath());
			driver =new ChromeDriver();
		}
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 return driver;
	}
public void closeBrowser(WebDriver Idriver)
{
	Idriver.close();
}
}

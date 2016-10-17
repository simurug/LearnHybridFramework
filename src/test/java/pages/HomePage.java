package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver;
	public void Homepage(WebDriver idriver)
	{
		this.driver=idriver;
	}
	
	@FindBy(xpath="//a[text()='Features']") WebElement features;
	//WebElement features = driver.findElement(By.xpath("//a[text()='Features']"));

	@FindBy(xpath="//[@id='input_e_mail']") WebElement email;
	@FindBy(xpath="//*[@id='step_main_1']/div[5]/div/div") WebElement submit;
	
	public void clickonfeatures()
	{
		features.click();
	}

	public void createnewstore()
	{
		submit.click();
	}
	
}

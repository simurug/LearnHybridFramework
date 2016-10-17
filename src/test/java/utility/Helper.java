package utility;


import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Helper {


public static String  captureScreenshot(WebDriver driver,String screenshotName)
{


TakesScreenshot ts=(TakesScreenshot)driver;

File source=ts.getScreenshotAs(OutputType.FILE);

 String destination =  "C:\\Users\\mssiv\\workspace\\HybridFramework\\screenshots\\"+screenshotName+System.currentTimeMillis()+".png" ;
try
{
FileUtils.copyFile(source,new File(destination));

System.out.println("Screenshot taken");
} 

catch (Exception e)
{

System.out.println("Exception while taking screenshot "+e.getMessage());
}
//return destination;
return destination;

}

}
package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider()
	{
		File src=new File("C:\\Users\\mssiv\\workspace\\HybridFramework\\configuration\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			 pro      = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			 
			System.out.println(e.getMessage());
		}
	}

	public String getapplicationurl()
	{
		String url=pro.getProperty("url");
		return url;
	}

	
	public String chromepath()
	{
		String path=pro.getProperty("chromepath");
		return path;
	}

}


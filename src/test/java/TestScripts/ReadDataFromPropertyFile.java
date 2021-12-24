package TestScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.ecom.appium.GenericUtils.IPathConstant;

public class ReadDataFromPropertyFile
{

		@Test
		public void getPropertyValue() throws Throwable
		{
			
		FileInputStream file=new FileInputStream(IPathConstant.PROPERTY_FILEPATH);
		Properties prop=new Properties();
		prop.load(file);
		String platformname=prop.getProperty("platformName");
		System.out.println(platformname);
		}
	
}

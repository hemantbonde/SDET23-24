package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.ecom.appium.GenericUtils.FileUtility;

import io.appium.java_client.android.AndroidDriver;

public class LaunchApp 
{
	@Test
	public void launch() throws Throwable
	{
		FileUtility file=new FileUtility();
		
		 String platformName = file.getPropertyKeyValue("platformName");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","Ashish's One Plus 6");
		dc.setCapability("automationName","appium");
		dc.setCapability("platformVersion","11");
		dc.setCapability("platformName","platformName");
		dc.setCapability("UDID","f1f64814");
		Thread.sleep(4000);
		
		dc.setCapability("appPackage","com.oneplus.calculator");
		dc.setCapability("appActivity","Calculator");
		
		//import URL from java.net
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
	}
	
}

	

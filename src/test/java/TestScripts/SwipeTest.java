package TestScripts;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SwipeTest
{
	@Test
	public void swipe() throws Throwable
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability("deviceName","Ashish's One Plus 6");
		dc.setCapability("automationName","appium");
		dc.setCapability("platformVersion","11");
		dc.setCapability("platformName","Android");
		dc.setCapability("UDID","f1f64814");
		dc.setCapability("noReset",true);
		
		dc.setCapability("appPackage","jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity",".TouchScreenTestActivity");
		
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		Dimension size=driver.manage().window().getSize(); 
		int ht=size.getHeight();
		int wd=size.getWidth();
		
		driver.swipe((int)(wd*0.1),ht/2,(int)(wd*0.8),ht/2,1000);
		driver.swipe(wd/2,(int)(ht*0.1),wd/2,(int)(ht*0.8),1000);
		
		
		
		
		
		
		
		
	
		
	}
	
}

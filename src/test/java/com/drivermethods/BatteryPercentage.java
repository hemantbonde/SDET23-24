package com.drivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class BatteryPercentage 
{
	@Test
	public void batteryPercentage() throws MalformedURLException, InterruptedException

{
		
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("deviceName","Ashish's One Plus 6");
	dc.setCapability("automationName","appium");
	dc.setCapability("platformVersion","11");
	dc.setCapability("platformName","Android");
	dc.setCapability("UDID","f1f64814");
	
	//dc.setCapability("appPackage","com.davemorrissey.labs.subscaleview.sample");
	//dc.setCapability("appActivity","MainActivity");
	
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	System.out.println(driver.executeScript("mobile:batteryInfo"));
	driver.setLocation(new Location(49, 123, 10));
	Location loc = driver.location();
	System.out.println(loc);
	
	
}
}
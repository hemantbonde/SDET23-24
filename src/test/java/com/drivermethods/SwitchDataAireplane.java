package com.drivermethods;

import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;

public class SwitchDataAireplane 
{
	@Test
	public void switchData() throws Throwable 
	{
		
		
		 DesiredCapabilities dc=new DesiredCapabilities();
		  
		  //Common Dc Android or Ios
		  
			dc.setCapability("deviceName","Ashish's One Plus 6");
			dc.setCapability("automationName","appium");
			dc.setCapability("platformVersion","11");
			dc.setCapability("platformName","Android");
			dc.setCapability("UDID","f1f64814");
		 
		  
		  //DesiredCapabilities for Android
		  
		  dc.setCapability("appPackage","com.androidsample.generalstore");
		  dc.setCapability("appActivity",".SplashActivity");
		 
		  //Android server port no
		  
		URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(url,dc);
		Thread.sleep(3000);
	//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ashish");
	Connection currentstate=driver.getConnection();
	System.out.println(currentstate);
	Thread.sleep(1000);
	driver.setConnection(Connection.DATA);
	Thread.sleep(2000);
	System.out.println(driver.getConnection());
	Thread.sleep(3000);
	driver.setConnection(Connection.WIFI);
	Thread.sleep(2000);
	System.out.println(driver.getConnection());
	
	Thread.sleep(2000);
	driver.setConnection(Connection.AIRPLANE);
	System.out.println(driver.getConnection());
	
}
}
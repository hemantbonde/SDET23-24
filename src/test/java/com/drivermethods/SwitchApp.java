package com.drivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SwitchApp 
{
	@Test
	public void switchApp() throws Throwable {
		
	
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
	
	driver.startActivity("io.appium.android.apis","ApiDemos");
	//Alternate Method To Launch App
	//driver.launchApp();
	driver.startActivity("com.androidsample.generalstore","SplashActivity");
	//driver.launchApp();
	
	
	
	
}
}


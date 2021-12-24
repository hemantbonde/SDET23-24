package com.drivermethods;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import TestScripts.ClickPicture;
import io.appium.java_client.android.AndroidDriver;

public class GeneralStorePopUp 
{

	@Test
	public void generalStore() throws Throwable {
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
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		 //takeScrrenshot(driver,"Genera2");
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		 String toastmsg=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		
		
		
}
}


package com.drivermethods;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;

public class Practice 
{

	@Test
	public void practice() throws Throwable
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("UDID","f1f64814");
		dc.setCapability("deviceName", "Ashish's One Plus 6");
		dc.setCapability("automationName","Appium");
		dc.setCapability("platformVersion","11");
		
		
		dc.setCapability("appPackage","com.androidsample.generalstore");
		dc.setCapability("appActivity",".SplashActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(url,dc);
		Connection currrentState=driver.getConnection();
		driver.setConnection(Connection.AIRPLANE);
		WebElement ele = driver.findElement(By.id("productAddCart"));
		
		Dimension d=driver.manage().window().getSize();
		int ht=(int) d.getHeight();
		int wd=(int) d.getWidth();
		driver.swipe((int)(wd*0.1), (ht/2), (int)(wd*0.9),(ht/2), 3000);
		
	}
	
	
}

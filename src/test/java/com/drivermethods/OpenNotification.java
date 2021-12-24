package com.drivermethods;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class OpenNotification 
{
	@Test
	public void oprnNotification() throws Throwable {
		
		
		 DesiredCapabilities dc=new DesiredCapabilities();
		  
		  //Common Dc Android or Ios
		  
			dc.setCapability("deviceName","Ashish's One Plus 6");
			dc.setCapability("automationName","appium");
			dc.setCapability("platformVersion","11");
			dc.setCapability("platformName","Android");
			dc.setCapability("UDID","f1f64814");
		 
		  
		  //DesiredCapabilities for Android
		  
		  dc.setCapability("appPackage","io.appium.android.apis");
		  dc.setCapability("appActivity","ApiDemos");
		 
		  //Android server port no
		  
		URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(url,dc);
		Thread.sleep(4000);
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//driver.openNotifications();
		//driver.findElementByAccessibilityId("API Demos").click();
		//Thread.sleep(2000);
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.id("android:id/button1")).click();
		
		//Thread.sleep(500);
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Notification\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"IncomingMessage\"]")).click();
		driver.findElement(By.id("io.appium.android.apis:id/notify_app")).click();
		driver.openNotifications();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout[3]/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")).click();
}
}

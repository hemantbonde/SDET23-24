package com.drivermethods;

import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;

public class ToGetWindowHandles 
{
	@Test
	public void getWindowHandles() throws Throwable {
		
		
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
		Thread.sleep(4000);
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ashish");
		Thread.sleep(1000);
		driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("productAddCart")).click();	
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView")).click();
		
		//String price = driver.findElement(By.id("productPrice")).getText();
		//System.out.println(price);
		Thread.sleep(4000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(2000);
		
		Set<String> windows = driver.getContextHandles();
		for(String window:windows)
		{
			System.out.println("Active Applications :"+window);
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(1000);
		
		
		//To Open App in web view
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ashish");
		/*Connection currentstate=driver.getConnection();
		System.out.println(currentstate);
		driver.setConnection(Connection.WIFI);
		System.out.println(driver.getConnection());
		driver.setConnection(Connection.DATA);
		System.out.println(driver.getConnection());
		driver.setConnection(Connection.AIRPLANE);*/
		
		
		
		
		
		
		
		
		
		
		
	
}
}
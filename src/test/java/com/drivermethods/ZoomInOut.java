package com.drivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ZoomInOut 
{ 
	@Test
	public void zoomInOut() throws MalformedURLException, InterruptedException

{
		
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("deviceName","Ashish's One Plus 6");
	dc.setCapability("automationName","appium");
	dc.setCapability("platformVersion","11");
	dc.setCapability("platformName","Android");
	dc.setCapability("UDID","f1f64814");
	
	dc.setCapability("appPackage","com.davemorrissey.labs.subscaleview.sample");
	dc.setCapability("appActivity","MainActivity");
	
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	
    driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
    driver.findElement(By.id("android:id/button1")).click();
    driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
    WebElement img = driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
    driver.zoom(img);
    Thread.sleep(3000);
    driver.pinch(img);

}
}
package com.drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;

public class Orientation 
{
	static AndroidDriver driver;
	@Test
	public void screenOrientation() throws InterruptedException, Throwable, MalformedURLException
	{
	
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("deviceName","Ashish's One Plus 6");
	dc.setCapability("automationName","appium");
	dc.setCapability("platformVersion","11");
	dc.setCapability("platformName","Android");
	dc.setCapability("UDID","f1f64814");
	dc.setCapability("noReset",true);
	Thread.sleep(4000);
	//To set No reset = true
	
	dc.setCapability("appPackage","io.appium.android.apis");
	dc.setCapability("appActivity","ApiDemos");

	//import URL from java.net
	URL url=new URL("http://localhost:4723/wd/hub");
	driver=new AndroidDriver(url,dc);
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	WebElement views=driver.findElementByAccessibilityId("Views");
	views.click();
	ScreenOrientation currentscreenorientation =driver.getOrientation();
	System.out.println(currentscreenorientation);
	Thread.sleep(1000);
	driver.rotate(ScreenOrientation.LANDSCAPE);
	System.out.println(driver.getOrientation());
    Thread.sleep(1000);
    driver.rotate(ScreenOrientation.PORTRAIT);
	System.out.println(driver.getOrientation());
    Thread.sleep(1000);
	
	
	
	
	
}
}
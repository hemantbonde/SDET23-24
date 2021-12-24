package com.drivermethods;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AndroidKeyActions
{
	@Test
	public void androidkeyActions() throws Throwable
	{
		AppiumDriverLocalService service=AppiumDriverLocalService.buildDefaultService();
		service.start();
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("deviceName","Ashish's One Plus 6");
	dc.setCapability("automationName","appium");
	dc.setCapability("platformVersion","11");
	dc.setCapability("platformName","Android");
	dc.setCapability("UDID","f1f64814");
	Thread.sleep(4000);
	
	dc.setCapability("appPackage","com.oneplus.camera");
	dc.setCapability("appActivity","MainActivity");
	
	//import URL from java.net
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	//driver.closeApp();
	Thread.sleep(1000);
	
	
	System.out.println(AndroidKeyCode.KEYCODE_VOLUME_UP);
	System.out.println(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
	System.out.println(AndroidKeyCode.KEYCODE_BACK);
	System.out.println(AndroidKeyCode.KEYCODE_ENTER);
	System.out.println(AndroidKeyCode.KEYCODE_BACK);
	System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
	System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
	System.out.println(AndroidKeyCode.KEYCODE_CAMERA);
	System.out.println(AndroidKeyCode.KEYCODE_CONTACTS);
	Thread.sleep(2000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
	Thread.sleep(2000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
	Thread.sleep(2000);
	driver.pressKeyCode(AndroidKeyCode.BACK);
	Thread.sleep(2000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
	service.stop();
}
}

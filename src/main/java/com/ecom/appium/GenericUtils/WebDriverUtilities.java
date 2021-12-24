package com.ecom.appium.GenericUtils;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class WebDriverUtilities
{
	static AndroidDriver driver=new AndroidDriver(null);
	public static void TapOnElement(WebElement element)
	{
		driver.tap(1,element,1000);
	}	
	
	public static void scrollToElement(AndroidDriver driver,String an,String av)
    {
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
    }
}

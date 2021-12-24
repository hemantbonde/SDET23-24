package TestScripts;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class DragAndDrop 
{
	static AndroidDriver driver;
	@Test
	public void dragAndDrop() throws Throwable
	{

	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("deviceName","Ashish's One Plus 6");
	dc.setCapability("automationName","appium");
	dc.setCapability("platformVersion","11");
	dc.setCapability("platformName","Android");
	dc.setCapability("UDID","f1f64814");
	
	dc.setCapability("appPackage","io.appium.android.apis");
	dc.setCapability("appActivity","ApiDemos");
	
	URL url=new URL("http://localhost:4723/wd/hub");
	
	
	driver=new AndroidDriver(url,dc);
	
	
	
	WebElement contn = driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
	TapOnElement(contn);
	
	WebElement ok = driver.findElement(By.id("android:id/button1"));
	TapOnElement(ok);
	WebElement ClickContinue = driver.findElementByAccessibilityId("Views");
	driver.tap(1, ClickContinue, 500);
	
	WebElement dnd = driver.findElementByAccessibilityId("Drag and Drop");
	driver.tap(1, dnd, 500);
	Thread.sleep(3000);
	
	
	WebElement src = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
	TapOnElement(src);
	WebElement dest = driver.findElement(By.id("io.appium.android.apis:id/drag_text"));
	TapOnElement(dest);
	TouchAction a=new TouchAction(driver);
	a.longPress(src).perform();
	a=new TouchAction(driver);
	a.longPress(src).moveTo(dest).release().perform();
	}
	public static void TapOnElement(WebElement element)
	{
		driver.tap(1, element, 1000);
	}
	
	
	
	
	
	
	
	
	
	}


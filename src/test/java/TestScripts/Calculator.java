package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.objenesis.instantiator.android.Android10Instantiator;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class Calculator 
{
	
@Test
public void calculator() throws MalformedURLException, InterruptedException
{
	DesiredCapabilities dc=new DesiredCapabilities();
	//common Desired capabilities for Android or iOS
	dc.setCapability("deviceName","Ashish's One Plus 6");
	dc.setCapability("automationName","appium");
	dc.setCapability("platformVersion","11");
	dc.setCapability("platformName","Android");
	dc.setCapability("UDID","f1f64814");
	
	//Thread.sleep(3000);
	
	//desired capabilities for android
	dc.setCapability("appPackage","com.oneplus.calculator");
	dc.setCapability("appActivity","Calculator");
	
	
	//Android port
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	//Thread.sleep(3000);
	driver.findElement(By.id("com.oneplus.calculator:id/digit_7")).click();
	driver.findElement(By.id("com.oneplus.calculator:id/op_add")).click();
	driver.findElement(By.id("com.oneplus.calculator:id/digit_5")).click();
	driver.findElement(By.id("com.oneplus.calculator:id/eq")).click();
	String formula = driver.findElement(By.id("com.oneplus.calculator:id/formula")).getText();
	String text = driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
	System.out.println(formula);
	System.out.println(text);
	
	//for iOS
	//IOSDriver<WebElement>
}

}

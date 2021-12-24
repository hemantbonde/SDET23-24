package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class CalculatorSub 
{
	
	@Test
	public void subtract() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","Ashish's One Plus 6");
		dc.setCapability("automationName","appium");
		dc.setCapability("platformVersion","11");
		dc.setCapability("platformName","Android");
		dc.setCapability("UDID","f1f64814");
		
		
		dc.setCapability("appPackage","com.oneplus.calculator");
		dc.setCapability("appActivity","Calculator");
		
		//import URL from java.net
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		driver.findElement(By.id("com.oneplus.calculator:id/digit_7")).click();
		driver.findElement(By.id("com.oneplus.calculator:id/op_div")).click();
		driver.findElement(By.id("com.oneplus.calculator:id/digit_5")).click();
		driver.findElement(By.id("com.oneplus.calculator:id/eq")).click();
		String text = driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
		System.out.println(text);
		
		driver.findElement(By.id("com.oneplus.calculator:id/digit_9")).click();
		driver.findElement(By.id("com.oneplus.calculator:id/op_sub")).click();
		driver.findElement(By.id("com.oneplus.calculator:id/digit_5")).click();
		driver.findElement(By.id("com.oneplus.calculator:id/eq")).click();
		String result = driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
		System.out.println(result);
		
		
		
		
		
	}
	
	
}
	
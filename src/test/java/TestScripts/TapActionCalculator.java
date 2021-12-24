package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TapActionCalculator {
	
	@Test
	public void tapAction() throws MalformedURLException
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
		WebElement seven = driver.findElement(By.id("com.oneplus.calculator:id/digit_9"));
		driver.tap(1, seven, 500);
		WebElement div = driver.findElement(By.id("com.oneplus.calculator:id/op_add"));
		driver.tap(1, div, 500);
		WebElement five = driver.findElement(By.id("com.oneplus.calculator:id/digit_3"));
		driver.tap(1, five, 500);
		WebElement equals = driver.findElement(By.id("com.oneplus.calculator:id/eq"));
		driver.tap(1, equals, 500);
		String text = driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
		System.out.println(text);
		
	}
}

	

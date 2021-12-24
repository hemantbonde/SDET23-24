package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ScriptTwo
{

	@Test
	public void scriptTwo() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","Ashish's One Plus 6");
		dc.setCapability("automationName","appium");
		dc.setCapability("platformVersion","11");
		dc.setCapability("platformName","Android");
		dc.setCapability("UDID","f1f64814");
		
		dc.setCapability("appPackage","com.androidsample.generalstore");
		dc.setCapability("appActivity","SplashActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		Thread.sleep(7000);
		//driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		//WebElement dropDown = driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry"));
		//Select s=new Select(dropDown);
		//s.selectByVisibleText("Afghanistan");
		//List<WebElement> options = s.getOptions();
		
		//for(WebElement b:options)
		//{
			//System.out.println(b);
		//}
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ashish");
		driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		//System.out.println(options);
		
	}
	
}

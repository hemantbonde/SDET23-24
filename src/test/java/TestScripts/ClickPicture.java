package TestScripts;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.appium.java_client.android.AndroidDriver;

public class ClickPicture 
{
	@Test
	public void clickonPhoto() throws Throwable
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","Ashish's One Plus 6");
		dc.setCapability("automationName","appium");
		dc.setCapability("platformVersion","11");
		dc.setCapability("platformName","Android");
		dc.setCapability("UDID","f1f64814");
		
		//DC for Android
		  
		  dc.setCapability("appPackage","io.appium.android.apis");
		  dc.setCapability("appActivity",".ApiDemos");
		  
		  
		  URL url=new URL("http://localhost:4723/wd/hub");
			AndroidDriver driver=new AndroidDriver(url,dc);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
			driver.findElement(By.id("android:id/button1")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		    scrollToElement(driver,"text","Lists");
		    driver.findElement(By.xpath("//android.widget.TextView[@text='Lists']")).click();
		    driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"08. Photos\"]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id("io.appium.android.apis:id/add")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id("io.appium.android.apis:id/clear")).click();
		    takeScrrenshot(driver,"General");
	}
	 public static void scrollToElement(AndroidDriver driver,String an,String av)
	    {
	    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	    }
	    public static String takeScrrenshot(WebDriver driver,String screenshotName) throws Throwable{
	    	String screenshotPath="./screenshot"+screenshotName+".PNG";
	    	TakesScreenshot ts=(TakesScreenshot)driver;
	    	File src=ts.getScreenshotAs(OutputType.FILE);
	    	File dest=new File(screenshotPath);
	    	Files.copy(src, dest);
	    	return screenshotPath;
	    	}
}
	
		
	
	
	


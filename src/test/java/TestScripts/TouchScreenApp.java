package TestScripts;

import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.ecom.appium.GenericUtils.FileUtility;

import io.appium.java_client.android.AndroidDriver;

public class TouchScreenApp
{
	@Test
	public void launch() throws Throwable
	{
		//FileUtility file=new FileUtility();
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","Ashish's One Plus 6");
		dc.setCapability("automationName","appium");
		dc.setCapability("platformVersion","11");
		dc.setCapability("platformName","Android");
		dc.setCapability("UDID","f1f64814");
		Thread.sleep(4000);
		
		dc.setCapability("appPackage","jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity",".TouchScreenTestActivity");
		
		//import URL from java.net
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		Thread.sleep(1000);
		
		//To get Height and width of phone
		Dimension size=driver.manage().window().getSize();
				int ht=size.getHeight();
				int wd=size.getWidth();
				System.out.println("Height of phone is"+ht);
				System.out.println("Width of phone"+wd);
		
		
		/*
		//Vertical Swipe
		driver.swipe(543,241,552,1236,500);//(Start x,start y,end x,end y,duration)
		//Inclined Swipe
		driver.swipe(894, 287, 226, 921, 500);
		//Horizontal swipe
		driver.swipe(882, 662, 67, 680, 500);
		//Inclined Swipe
		driver.swipe(253, 342, 772, 585, 500);
		*/
		//vertical swipe
		driver.swipe(wd/2,(int)(ht*0.25),wd/2,(int)(ht*0.80),1000);
		driver.swipe((int)(wd*0.1),(int)(ht*0.2),(int)(wd*0.1), (int)(ht*0.8), 500);
		driver.swipe((int)(wd*0.5),(int)(ht*0.2),(int)(wd*0.5), (int)(ht*0.8), 500);
		driver.swipe((int)(wd*0.9),(int)(ht*0.2),(int)(wd*0.9), (int)(ht*0.8), 500);
		
		
		
		
		//Horizontal Swipe
		//driver.swipe((int)(wd*0.25),ht/2,(int)(wd*0.80),ht/2,1000);
		driver.swipe((int)(wd*0.25),ht/2,(int)(wd*0.80),ht/2,1000);
		driver.swipe((int)(wd*0.1),(int)(ht*0.8),(int)(wd*0.9), (int)(ht*0.8), 500);
		driver.swipe((int)(wd*0.1),(int)(ht*0.2),(int)(wd*0.9), (int)(ht*0.2), 500);
		driver.swipe((int)(wd*0.1),(int)(ht*0.5),(int)(wd*0.9), (int)(ht*0.5), 500);
		
		
		
		
		
		
		
		
		
	}
	
}

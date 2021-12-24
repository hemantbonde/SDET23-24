package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class UninstallAppiumDemos 
{

	public static void main(String[] args) throws MalformedURLException
	{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("deviceName","Ashish's One Plus 6");
	dc.setCapability("automationName","appium");
	dc.setCapability("platformVersion","11");
	dc.setCapability("platformName","Android");
	dc.setCapability("UDID","f1f64814");
	
	
	
	
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	
	//Uninstall App
	System.out.println("App status = " + driver.isAppInstalled("io.appium.android.apis"));
	driver.removeApp("io.appium.android.apis");
	//System.out.println();
	
}

	
	
}

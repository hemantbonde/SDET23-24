package TestScripts;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidKeyCode;
//import io.appium.java_client.service.local.AppiumDriverLocalService;

public class ServiceStartAndStop 
{	
	static AndroidDriver driver;
	public static void main(String[] args)throws Throwable
	{
	AppiumDriverLocalService server=AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withArgument(GeneralServerFlag.SESSION_OVERRIDE).usingPort(4723).withLogFile(new File("..//Appium_sdet23/Logs.txt")));
	server.start();
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("deviceName","Ashish's One Plus 6");
	dc.setCapability("automationName","appium");
	dc.setCapability("platformVersion","11");
	dc.setCapability("platformName","Android");
	dc.setCapability("UDID","f1f64814");
	dc.setCapability("noReset",true);
	Thread.sleep(4000);
	//To set No reset = true
	
	dc.setCapability("appPackage","com.oneplus.camera");
	dc.setCapability("appActivity","MainActivity");

	//import URL from java.net
	URL url=new URL("http://localhost:4723/wd/hub");
	driver=new AndroidDriver(url,dc);
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
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
	server.stop();
	}
	
}

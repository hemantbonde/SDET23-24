package TestScripts;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


import com.ecom.appium.Pomclasses.LoginPage2;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class LoginTest2 {
	public AndroidDriver driver;
	@Test
	public void loginTest() throws Throwable 
	{
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("deviceName","Ashish's One Plus 6");
		dc.setCapability("automationName","appium");
		dc.setCapability("platformVersion","11");
		dc.setCapability("platformName","Android");
		dc.setCapability("UDID","f1f64814");
		
		
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		
		URL url =  new URL("http://localhost:4723/wd/hub");
		//@SuppressWarnings("rawtypes")
		AndroidDriver driver = new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		Thread.sleep(5000);
		
		LoginPage2 lp = new LoginPage2(driver);		
		lp.login();
		Thread.sleep(2000);
		//driver.pressKeyCode(AndroidKeyCode.BACK);
		lp.clickDD();
		LoginPage2.scrollToElement(driver, "text", "India");
		
		
	}


}

package TestScripts;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.ecom.appium.GenericUtils.WebDriverUtilities;
import com.ecom.appium.Pomclasses.LoginPage;

import io.appium.java_client.android.AndroidDriver;


public class LoginTest 
{
	
	static AndroidDriver driver;
	
	@Test
	public void loginTest() throws Throwable
	{
		
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability("deviceName","Ashish's One Plus 6");
			dc.setCapability("automationName","appium");
			dc.setCapability("platformVersion","11");
			dc.setCapability("platformName","platformName");
			dc.setCapability("UDID","f1f64814");
			//Thread.sleep(4000);
			
			dc.setCapability("appPackage","com.androidsample.generalstore");
			dc.setCapability("appActivity","SplashActivity");
			
			//import URL from java.net
			URL url=new URL("http://localhost:4723/wd/hub");
			AndroidDriver driver=new AndroidDriver(url,dc);
			
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			
			Thread.sleep(10000);
			LoginPage lp=new LoginPage(driver);
			Thread.sleep(7000);
			//lp.logins();
			Thread.sleep(4000);
		    lp.login("new user");
		
			
			
		}
		
		
	
		
		

	
}

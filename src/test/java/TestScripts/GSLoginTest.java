package TestScripts;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.ecom.appium.Pomclasses.GeneralStoreLoginPage;

import io.appium.java_client.android.AndroidDriver;

	public class GSLoginTest 
	{
		static AndroidDriver driver;
		@Test
		public void loginTest() throws Throwable
		{
			//WebdriverUtilities wbd= new WebdriverUtilities();
			DesiredCapabilities dc= new DesiredCapabilities();
			dc.setCapability("deviceName","Ashish's One Plus 6");
			dc.setCapability("automationName","appium");
			dc.setCapability("platformVersion","11");
			dc.setCapability("platformName","Android");
			dc.setCapability("UDID","f1f64814");
			

			dc.setCapability("appPackage", "com.androidsample.generalstore");
			dc.setCapability("appActivity",".SplashActivity" );
			
			URL url= new URL("http://localhost:4723/wd/hub");
			AndroidDriver driver= new AndroidDriver(url, dc);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			GeneralStoreLoginPage glp= new GeneralStoreLoginPage(driver);
			glp.login("Meghna");
			driver.closeApp();
			driver.startActivity("com.androidsample.generalstore",".SplashActivity");
			Thread.sleep(6000);
			glp.logins();
			
		}

	}
	
	

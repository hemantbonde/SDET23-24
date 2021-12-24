package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import io.appium.java_client.android.AndroidDriver;

public class ScriptOne 
{

	@Test
	public void scriptOne() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","Ashish's One Plus 6");
		dc.setCapability("automationName","appium");
		dc.setCapability("platformVersion","11");
		dc.setCapability("platformName","Android");
		dc.setCapability("UDID","f1f64814");
		
		dc.setCapability("appPackage","io.appium.android.apis");
		dc.setCapability("appActivity","ApiDemos");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
		
		AndroidDriver driver=new AndroidDriver(url,dc);
		WebElement ClickContinue = driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		driver.tap(1, ClickContinue, 500);
		
		WebElement clickOK = driver.findElement(By.id("android:id/button1"));
		driver.tap(1, clickOK, 500);
		Thread.sleep(3000);
		
		
		WebElement views = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
		driver.tap(1, views, 500);
		Thread.sleep(3000);
		WebElement controls = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]"));
		driver.tap(1, controls, 500);
		WebElement darkTheme = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"2. Dark Theme\"]"));
		driver.tap(1, darkTheme, 500);
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("abfjafjk");
		
		WebElement chekbox1 = driver.findElement(By.id("io.appium.android.apis:id/check1"));
		driver.tap(1, chekbox1, 500);
		WebElement chekbox2 = driver.findElement(By.id("io.appium.android.apis:id/check2"));
		driver.tap(1, chekbox2, 500);
		WebElement radioBtn1 = driver.findElement(By.id("io.appium.android.apis:id/radio1"));
		driver.tap(1, radioBtn1, 500);
		WebElement radioBtn2 = driver.findElement(By.id("io.appium.android.apis:id/radio2"));
		driver.tap(1, radioBtn2, 500);
		
		//To hide keyboard
		
		driver.hideKeyboard();
		WebElement starBtn= driver.findElement(By.id("io.appium.android.apis:id/star"));
		driver.tap(1, starBtn, 500);
		
	    WebElement OnOff1 = driver.findElement(By.id("io.appium.android.apis:id/toggle1"));
		driver.tap(1, OnOff1, 500);
		
		
		WebElement OnOff2 = driver.findElement(By.id("io.appium.android.apis:id/toggle2"));
		driver.tap(1, OnOff2, 500);
		
		Thread.sleep(3000);
		
		WebElement dropDown = driver.findElement(By.id("io.appium.android.apis:id/spinner1"));
		driver.tap(1, dropDown, 500);
	  
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner")).click();
		 List<WebElement>options = driver.findElements(By.xpath("//android.widget.CheckedTextView[@resource-id='io.appium.android.apis:id/spinner1']"));
			
		 for(WebElement b:options)
			{
				
				System.out.println(b.getText());
			}
		 
		 for(int i=1;i<options.size();i++)
			{
				System.out.println(((WebElement) options.get(i)).getText());
			}	
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[5]")).click();
		
		
		
		
		driver.findElement(By.id("io.appium.android.apis:id/button")).click();
		 //List<WebElement>options = driver.findElementsByXPath("//android.widget.TextView[@resourece-id='android:id/text1']");
		
		 
		
	}
		
		
		
		

		
		
		
		

	
	
}

package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class GetList 
{	@Test
	public void getList() throws MalformedURLException, InterruptedException

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
	  dc.setCapability("appPackage","io.appium.android.apis");
	  dc.setCapability("appActivity",".ApiDemos");
	 
	  //Android server port no
	  
	
	
	
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"2. Dark Theme\"]")).click();
	//driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("manager");
	driver.hideKeyboard();
	//driver.findElement(By.id("io.appium.android.apis:id/check1")).click();
	//driver.findElement(By.id("io.appium.android.apis:id/check2")).click();
	//driver.findElement(By.id("io.appium.android.apis:id/radio1")).click();
	//driver.findElement(By.id("io.appium.android.apis:id/radio2")).click();
	//driver.findElement(By.id("io.appium.android.apis:id/star")).click();
	driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
	
	driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1']"));
	List<WebElement> options = driver.findElements(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1']"));
	for(WebElement element:options)
	{
		System.out.println(element.getText());
	}
	for(int i=1;i<options.size();i++)
	{
		System.out.println(((WebElement) options.get(i)).getText());
	}
}
	
	
	
		
}


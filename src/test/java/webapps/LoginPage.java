package webapps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage 
{	@Test
	public void login() throws Throwable
	{
		
	DesiredCapabilities dc=new DesiredCapabilities();
	
	dc.setCapability("deviceName","Ashish's One Plus 6");
	dc.setCapability("automationName","appium");
	dc.setCapability("platformVersion","11");
	dc.setCapability("platformName","Android");
	dc.setCapability("UDID","f1f64814");
	dc.setCapability("noReset",true);
	dc.setCapability("browserName","Chrome");
	
	
	
	
	
	URL url=new URL("http://localhost:4723/wd/hub");
	
	AndroidDriver driver=new AndroidDriver(url,dc);
	
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("https://en-gb.facebook.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='m_login_email']")).sendKeys("73879213893");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("90ud09vus990");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
	
	
	
	
	
	
	

	
	
}
}
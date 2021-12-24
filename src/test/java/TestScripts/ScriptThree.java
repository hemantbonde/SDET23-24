package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import io.appium.java_client.android.AndroidDriver;

public class ScriptThree
{

	@Test
	public void scriptThree() throws MalformedURLException, InterruptedException
	{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("deviceName","Ashish's One Plus 6");
	dc.setCapability("automationName","appium");
	dc.setCapability("platformVersion","11");
	dc.setCapability("platformName","Android");
	dc.setCapability("UDID","f1f64814");
	
	dc.setCapability("appPackage","com.androidsample.generalstore");
	dc.setCapability("appActivity","SplashActivity");
	
	
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	Thread.sleep(3000);
	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ashish");
	driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
    /*WebElement dropDown = driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry"));
	dropDown.click();
	String list = dropDown.getText();
	System.out.println(list);
	dropDown.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
	Select s= new Select(dropDown);
	s.selectByIndex(7);*/
	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("productAddCart")).click();	
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]")).click();
	String price = driver.findElement(By.id("productPrice")).getText();
	System.out.println(price);
	Thread.sleep(4000);
	
	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	Thread.sleep(2000);
	String price2 = driver.findElement(By.id("productPrice")).getText();
	Thread.sleep(3000);
	System.out.println(price2);
	String total = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
	System.out.println(total);
	
	//JavaScriptExecutor js=(JavaScriptExecutor)driver;
	//driver.executeScript("window.ScrollBy(0,3000)");
	
	}


}

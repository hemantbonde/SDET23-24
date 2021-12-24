package vTiger;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//package TestScriptsPracties;



	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ecom.appium.GenericUtils.WebDriverUtility;

import junit.framework.Assert;

public class Script1Demo 
{

	
	public class Test11 {
	@Test
	public void Test01()   throws InterruptedException, IOException 
	{
		WebDriverUtility wutil=new WebDriverUtility();
        FileInputStream file=new FileInputStream("./Data/Commondata.properties");
        Properties p=new Properties();
        p.load(file);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get(p.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys(p.getProperty("username"));
		driver.findElement(By.name("user_password")).sendKeys(p.getProperty("password"));
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("accountname")).sendKeys("IB");
		driver.findElement(By.xpath("//input[@size='27']")).sendKeys("www.ibm.com");
		driver.findElement(By.id("phone")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.id("fax")).sendKeys("1234@efaxsend.com ");
		Thread.sleep(2000);
		driver.findElement(By.id("email1")).sendKeys("ibm123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("button")).click();
		
		  
	String title=driver.getTitle();
	String expectedtitle="Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM";
	SoftAssert s=new SoftAssert();
s.assertEquals(title,expectedtitle);
		  s.assertAll();
		driver.navigate().refresh();
		
			
		
		WebElement element = driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
		Thread.sleep(3000);
		 //Actions action=new Actions(driver);
		//	action.moveToElement(element).perform();
			wutil.mouseHover(driver, element);
			driver.findElement(By.linkText("Sign Out")).click();
			Thread.sleep(2000);
		
		 	driver.close();
			
	}
	
	
	}
}
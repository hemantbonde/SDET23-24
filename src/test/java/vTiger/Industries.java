package vTiger;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.ecom.appium.GenericUtils.IPathConstant;
import com.ecom.appium.GenericUtils.WebDriverUtility;

public class Industries 
{

	@Test
	public void industries() throws Exception 
	{
		WebDriverUtility wb=new WebDriverUtility();
		WebDriver driver=new ChromeDriver();
		FileInputStream fs=new FileInputStream(IPathConstant.PROPERTY);
		
		Properties p=new Properties();
		p.load(fs);
		//System.setProperty("webdriver.chrome.driver", "‪C:\\Users\\User1\\Downloads\\chromedriver.exe");
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(p.getProperty("password"));
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@class='detailedViewTextBox']")).sendKeys("Org1");
		driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.org1.org");
		
		driver.findElement(By.xpath("//input[@value='T']")).click();
		Thread.sleep(2000);
		
		WebElement dd2 = driver.findElement(By.xpath("//select[@name='assigned_group_id']"));
		wb.selectByValue("2",dd2);
		
		/*Select s1=new Select(dd2);
		s1.selectByValue("2");
		*/
		
		WebElement dd = driver.findElement(By.xpath("//select[@name='industry']"));
		wb.selectByValue("--None--",dd);
		/*Select s=new Select(dd);
		s.selectByValue("--None--");
		*/
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		Thread.sleep(3000);
		wb.alertPopupOk(driver);
		WebElement signout = driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
		wb.mouseHover(driver, signout);
		driver.findElement(By.id("ondemand_sub")).click();
		
	}
}

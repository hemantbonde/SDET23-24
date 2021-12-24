package vTiger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ecom.appium.GenericUtils.IPathConstant;
import com.ecom.appium.GenericUtils.WebDriverUtility;

public class Contact
{
	@Test
	public void contact() throws InterruptedException, Throwable
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
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ashish");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kendre");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		
		/*String parent = driver.getWindowHandle();
		
		Set<String> child = driver.getWindowHandles();
		child.remove(parent);
		for(String b:child)
		{
			driver.switchTo().window(b);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Org1']")).click();
		}
		
		driver.switchTo().window(parent);
		*/
		
		wb.switchToWindow(driver,"TasksEditView&form_submit");
		driver.findElement(By.xpath("//a[text()='Org1']")).click();
		wb.switchToWindow(driver,"EditView&return_action");
		WebElement dd = driver.findElement(By.xpath("//select[@name='salutationtype']"));
		wb.selectByValue("Mr.", dd);
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		
		/*Select s=new Select(dd);
		s.selectByValue("Mr.");
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		*/
		String title=driver.getTitle();
		SoftAssert st=new SoftAssert();
		st.assertEquals(title,"Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM");
		st.assertAll();
		
		//wb.alertPopupOk(driver);
		WebElement signout = driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
		wb.mouseHover(driver, signout);
		driver.findElement(By.id("ondemand_sub")).click();
		
	}
	
	
}
